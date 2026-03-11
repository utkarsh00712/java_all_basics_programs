package practice;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str1 = sc.nextLine();
	String s = "";
	
	for( int i = str1.length()-1; i >= 0; i--) {
		     s=s+ str1.charAt(i);
	}
	System.out.println(s);
}
}
