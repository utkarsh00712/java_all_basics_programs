package StringFormatting;

import java.util.Scanner;

public class StringFormatting {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = "Hello %s How are you";
	System.out.println("Enter a String");
	String n = sc.nextLine();
	System.out.printf(str, n);
}
}
