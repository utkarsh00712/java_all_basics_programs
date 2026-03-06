
public class Temple {
	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 9; j++) {
				if (j == 0 || j == 8 || i == 0 || i == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
