package Introduction;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Connection to server Established");
	try {
	System.out.println("Enter two numbers for division");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	int q = a/b;
	System.out.println("the quotent is " + q);
	} catch(Exception e) {
		System.out.println("Some issue Ocuured please try Again");
	}
	System.out.println("Connection to server Terminated");
	
}
}
