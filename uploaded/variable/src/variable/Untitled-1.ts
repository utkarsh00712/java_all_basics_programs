<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>OTP Generator</title>
    <!-- Tailwind CSS CDN -->
    <script src="https://cdn.tailwindcss.com"></script>
    <!-- Inter Font -->
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Inter', sans-serif;
            background-color: #f0f2f5;
        }
        .container {
            max-width: 500px;
        }
        .otp-display {
            font-size: 3rem;
            letter-spacing: 0.1em;
        }
    </style>
</head>
<body class="flex items-center justify-center min-h-screen p-4">
    <!-- js-base32 for Base32 encoding/decoding - Moved here for better global scope availability -->
    <script src="https://cdn.jsdelivr.net/npm/js-base32@1.0.1/base32.min.js"></script>

    <div class="container bg-white p-8 rounded-xl shadow-lg border border-gray-200 w-full">
        <h1 class="text-3xl font-bold text-center text-gray-800 mb-6">OTP Generator</h1>

        <!-- Secret Key Section -->
        <div class="mb-6">
            <label for="secretKey" class="block text-gray-700 text-sm font-semibold mb-2">Your Secret Key (Base32 Encoded):</label>
            <div class="flex items-center space-x-2">
                <input type="text" id="secretKey" class="flex-1 p-3 border border-gray-300 rounded-lg bg-gray-50 text-gray-800 text-sm font-mono" readonly>
                <button id="copyKeyBtn" class="px-4 py-2 bg-indigo-600 text-white rounded-lg hover:bg-indigo-700 transition duration-300 shadow-md">
                    Copy Key
                </button>
            </div>
            <p id="keyCopyMessage" class="text-green-600 text-xs mt-1 hidden">Copied!</p>
        </div>

        <!-- OTP Display Section -->
        <div class="text-center mb-6 p-6 bg-indigo-50 rounded-xl border border-indigo-200">
            <p class="text-lg text-gray-600 font-medium mb-2">Current OTP:</p>
            <div class="flex items-center justify-center space-x-2">
                <span id="otpDisplay" class="otp-display font-bold text-indigo-800 animate-pulse">------</span>
                <button id="copyOtpBtn" class="px-3 py-1 bg-indigo-600 text-white text-sm rounded-lg hover:bg-indigo-700 transition duration-300 shadow-md self-end">
                    Copy OTP
                </button>
            </div>
            <p id="otpCopyMessage" class="text-green-600 text-xs mt-1 hidden">Copied!</p>
            <div class="mt-4 text-gray-600 text-sm font-medium">
                Next OTP in: <span id="countdown" class="font-bold text-indigo-700">30</span> seconds
            </div>
        </div>

        <!-- Generate Button (Optional, as it auto-updates) -->
        <div class="flex justify-center">
            <button id="generateOtpBtn" class="w-full py-3 bg-blue-600 text-white text-lg font-semibold rounded-lg hover:bg-blue-700 transition duration-300 shadow-md">
                Generate New OTP
            </button>
        </div>
    </div>

    <script>
        // Constants for TOTP
        const TIME_STEP = 30; // seconds
        const OTP_LENGTH = 6; // digits
        const HASH_ALGORITHM = 'SHA-1'; // HMAC-SHA1

        // DOM Elements
        const secretKeyInput = document.getElementById('secretKey');
        const otpDisplay = document.getElementById('otpDisplay');
        const countdownElement = document.getElementById('countdown');
        const copyKeyBtn = document.getElementById('copyKeyBtn');
        const copyOtpBtn = document.getElementById('copyOtpBtn');
        const generateOtpBtn = document.getElementById('generateOtpBtn');
        const keyCopyMessage = document.getElementById('keyCopyMessage');
        const otpCopyMessage = document.getElementById('otpCopyMessage');

        let secretKey = ''; // Will be generated on load
        let countdownInterval;

        /**
         * Converts a string to an ArrayBuffer.
         * @param {string} str The string to convert.
         * @returns {ArrayBuffer} The ArrayBuffer representation of the string.
         */
        function str2ab(str) {
            const buf = new ArrayBuffer(str.length);
            const bufView = new Uint8Array(buf);
            for (let i = 0, strLen = str.length; i < strLen; i++) {
                bufView[i] = str.charCodeAt(i);
            }
            return buf;
        }

        /**
         * Converts a byte array to a hexadecimal string.
         * @param {Uint8Array} byteArray The byte array.
         * @returns {string} The hexadecimal string.
         */
        function byteArrayToHex(byteArray) {
            return Array.from(byteArray, function(byte) {
                return ('0' + (byte & 0xFF).toString(16)).slice(-2);
            }).join('');
        }

        /**
         * Generates a random Base32 encoded secret key.
         * @param {number} length The desired length of the secret (in bytes).
         * @returns {string} The Base32 encoded secret key.
         */
        function generateSecretKey(length = 20) { // 20 bytes for SHA-1, 160 bits
            const randomBytes = new Uint8Array(length);
            window.crypto.getRandomValues(randomBytes);
            // Convert byte array to a regular array, then to a string for Base32.encode
            const secretString = String.fromCharCode.apply(null, Array.from(randomBytes));
            // Ensure base32 is defined before using it
            if (typeof base32 === 'undefined') {
                console.error("base32 library not loaded!");
                return "ERROR_LOADING_BASE32";
            }
            return base32.encode(secretString).replace(/=/g, ''); // Remove padding for cleaner look
        }

        /**
         * Generates a TOTP (Time-based One-Time Password).
         * This function implements the HOTP and TOTP algorithm as per RFC 6238 and RFC 4226.
         * @param {string} secret Base32 encoded secret key.
         * @param {number} timeStep Time step in seconds (e.g., 30 for TOTP).
         * @param {number} otpLength Length of the OTP (e.g., 6 or 8).
         * @returns {Promise<string>} The generated OTP.
         */
        async function generateTotp(secret, timeStep, otpLength) {
            try {
                // Ensure base32 is defined before using it
                if (typeof base32 === 'undefined') {
                    console.error("base32 library not loaded during OTP generation!");
                    return "ERROR";
                }
                // Decode the Base32 secret key
                const decodedSecretString = base32.decode(secret);
                const secretBytes = str2ab(decodedSecretString);

                // Get current time in milliseconds and convert to 8-byte counter
                const epoch = Math.floor(Date.now() / 1000); // Current Unix time in seconds
                const timeCode = Math.floor(epoch / timeStep); // Time-based counter

                const counterBytes = new Uint8Array(8);
                for (let i = 7; i >= 0; i--) {
                    counterBytes[i] = timeCode & 0xFF;
                    timeCode >>= 8;
                }

                // Import the HMAC-SHA-1 key
                const key = await window.crypto.subtle.importKey(
                    'raw',
                    secretBytes,
                    { name: 'HMAC', hash: { name: HASH_ALGORITHM } },
                    false, // Not extractable
                    ['sign']
                );

                // Sign the counter with the key
                const signature = await window.crypto.subtle.sign(
                    'HMAC',
                    key,
                    counterBytes
                );

                // Perform dynamic truncation (RFC 4226, Section 5.3)
                const hashBytes = new Uint8Array(signature);
                const offset = hashBytes[hashBytes.length - 1] & 0xF;
                const truncatedHash =
                    ((hashBytes[offset] & 0x7F) << 24) |
                    ((hashBytes[offset + 1] & 0xFF) << 16) |
                    ((hashBytes[offset + 2] & 0xFF) << 8) |
                    (hashBytes[offset + 3] & 0xFF);

                // Generate OTP
                const otp = truncatedHash % (10 ** otpLength);
                return String(otp).padStart(otpLength, '0');
            } catch (error) {
                console.error("Error generating OTP:", error);
                return "ERROR";
            }
        }

        /**
         * Updates the OTP and countdown display.
         */
        async function updateOtpAndCountdown() {
            const currentEpoch = Math.floor(Date.now() / 1000);
            const secondsIntoTimeStep = currentEpoch % TIME_STEP;
            const remainingSeconds = TIME_STEP - secondsIntoTimeStep;

            countdownElement.textContent = remainingSeconds;

            if (secondsIntoTimeStep === 0 || otpDisplay.textContent === '------') {
                otpDisplay.classList.add('animate-pulse'); // Add animation on generation
                const otp = await generateTotp(secretKey, TIME_STEP, OTP_LENGTH);
                otpDisplay.textContent = otp;
                setTimeout(() => {
                    otpDisplay.classList.remove('animate-pulse'); // Remove animation after a short delay
                }, 500); // Allow animation to play briefly
            }
        }

        /**
         * Handles copying text to clipboard and shows a message.
         * @param {HTMLElement} elementToCopyFrom The input element to get text from.
         * @param {HTMLElement} messageElement The message element to show.
         */
        function copyToClipboard(elementToCopyFrom, messageElement) {
            const textToCopy = elementToCopyFrom.value || elementToCopyFrom.textContent;
            try {
                // For input fields, use select and execCommand
                if (elementToCopyFrom.tagName === 'INPUT') {
                    elementToCopyFrom.select();
                    document.execCommand('copy');
                } else { // For span elements (OTP display)
                    const range = document.createRange();
                    range.selectNode(elementToCopyFrom);
                    window.getSelection().removeAllRanges(); // Clear current selection
                    window.getSelection().addRange(range); // Select the text
                    document.execCommand('copy');
                    window.getSelection().removeAllRanges(); // Deselect
                }

                messageElement.classList.remove('hidden');
                setTimeout(() => {
                    messageElement.classList.add('hidden');
                }, 1500); // Hide after 1.5 seconds
            } catch (err) {
                console.error('Failed to copy text: ', err);
                // Fallback for older browsers or specific environments
                // IMPORTANT: Removed alert() as per instructions
                // You might display a custom message box here if desired.
            }
        }

        // Event Listeners
        copyKeyBtn.addEventListener('click', () => copyToClipboard(secretKeyInput, keyCopyMessage));
        copyOtpBtn.addEventListener('click', () => copyToClipboard(otpDisplay, otpCopyMessage));
        generateOtpBtn.addEventListener('click', updateOtpAndCountdown); // Manual trigger

        // Initial setup on page load
        window.onload = function() {
            secretKey = generateSecretKey();
            secretKeyInput.value = secretKey;
            updateOtpAndCountdown(); // Generate initial OTP
            countdownInterval = setInterval(updateOtpAndCountdown, 1000); // Update every second
        };
    </script>
</body>
</html>
