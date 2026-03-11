package practice;

import java.util.Scanner;

public class Occurance {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	char ch = sc.next().charAt(0);
	int count = 0;
	System.out.println("Original String: " + str);
	System.out.println("Character: " + ch);
	for(int i = 0; i <= str.length()-1; i++) {
		if(str.charAt(i) == ch) {
			count++;
		}
	}
	
	System.out.println("The occurence of character " + ch + " is " + count);
}
}
