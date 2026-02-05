package SingleThreading;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	System.out.println("Main Method execution Started");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Banking Activity started");
	int pwd = 1234;
	int userPwd = sc.nextInt();
	
	if(pwd==userPwd) {
		System.out.println("Authentication Successful");
	} else {
		System.out.println("AccessDenied");
	}
	
	System.out.println("Banking Activity Ended");
	
	System.out.println("Printiong activity Started");
	for(int i = 1; i <= 10;i++) {
		System.out.println("Hello");
	}
	System.out.println("Printing activity Ended");
	
	System.out.println("Addition Activity Started");
	int a = 10;
	int b = 20;
	
	int res = a+b;
	System.out.println(res);
	System.out.println("Addition Activity Ended");
	System.out.println("Main method Execution Completed");
}
}
