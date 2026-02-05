package practice;

import java.util.Scanner;

public class PalindromebyString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a String: ");
	String str1 = sc.nextLine();
	System.out.println(str1);
	
	StringBuilder sb = new StringBuilder(str1);
	sb.reverse();
	String str2 = new String(sb);
	System.out.println(sb);
	if(str1.equals(str2)) {
		System.out.println("String is a palindrome");
	}
	else {
		System.out.println("String is not a palindrome");
	}
}
}
