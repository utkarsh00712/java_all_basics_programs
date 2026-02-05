package InfosysGrooming;

import java.util.Scanner;

public class Frequency {
public static void main(String[] args) {
	Scanner  sc= new Scanner(System.in);
	
	String str = sc.nextLine();
	System.out.println(recognizeString(str));
}
public static String recognizeString(String str) {
	int n = str.length();
	int [] freq = new int[26];
	
	char arr[] = str.toCharArray();
	
	for (char ch: arr) {
		freq[ch-'a']++;
	}
	int maxFreq = 0;
	int maxChar = 0;
	
	for(int i =0; i < 26; i++) {
		if(maxFreq > freq[i]) {
			maxFreq = freq[i];
			maxChar = i;
		}
	}
	
	if(maxFreq>freq[n+1/2]) {
		return "";
	}
	char [] result = new char[n];
	int idx = 0;
	
	while(freq[maxChar] >0) {
		result[idx] = (char)(maxChar + 'a');
		idx +=2;
		freq[maxChar]--;
	}
	
	for(int i = 0; i <26; i++) {
		while(freq[i]>0) {
			if(idx >= n) {
				idx = 1;
				result [idx] = (char)(i + 'a');
				idx +=2;
				freq[i]--;
			}
		}
	}
	String finalResult = new String(result);
	return new String(finalResult);
}
}
