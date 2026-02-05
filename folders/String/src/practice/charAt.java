package practice;

import java.util.Scanner;

public class charAt {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	int index = sc.nextInt();
	
	System.out.println("The character at index " + index + " is " + str.charAt(index));
}
}
