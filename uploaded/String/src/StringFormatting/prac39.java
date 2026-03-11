package StringFormatting;

import java.util.Scanner;

public class prac39 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int age = sc.nextInt();
	String str =   "Hello my name is %s, and i am %d years old. ";
	System.out.printf(str,s,age);
}
}
