package practice;

import java.util.Scanner;

public class Pal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String s1 = sc.nextLine();
	System.out.println(s1);
	
	StringBuilder sb = new StringBuilder(s1);
	sb.reverse();
	
	String s2 = new String(sb);
	
	if(s1.equals(s2)) {
		System.out.println("The String is Palindrome");
	} else {
		System.out.println("The String is not a Palindrome");
	}
}
}
