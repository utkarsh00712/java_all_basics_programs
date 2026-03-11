package StringFormatting;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//ist way
	String str1 = "Hello %s, Your total is %.2f";
	System.out.printf(str1, "Ravi", 123.4567);
	
	// 2nd way
	String str = String.format("Hello %s, Your total is %.2f ", "omkar", 1146.456);
	System.out.println(str);
	
	
}
}
