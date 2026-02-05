package practice;

import java.util.Scanner;

public class LongestPalindromeString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String longest = "";
	for(int i = 0; i <= str.length()-1; i++) {
		for(int j = i; j <= str.length()-1; j++) {
			String sub = str.substring(i, j+1);
			boolean isPalindrome = true;
		}
	}
}
}
