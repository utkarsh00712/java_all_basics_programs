package SingleThreading;

import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	banking();
	printing();
	addition();
}

static void banking() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Banking Activity started");
	int pwd = 1234;
	int userPwd = sc.nextInt();
	try {
	  Thread.sleep(3000);
	} catch(Exception e) {
		e.printStackTrace();
	}
	if(pwd==userPwd) {
		System.out.println("Authentication Successful");
	} else {
		System.out.println("AccessDenied");
	}
	
	System.out.println("Banking Activity Ended");
}

static void printing() {
	System.out.println("Printiong activity Started");
	for(int i = 1; i <= 10;i++) {
		try {
			  Thread.sleep(3000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("Hello");
	}
	System.out.println("Printing activity Ended");
}

static void addition() {
	System.out.println("Addition Activity Started");
	int a = 10;
	int b = 20;
	
	int res = a+b;
	try {
		  Thread.sleep(3000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	System.out.println(res);
	System.out.println("Addition Activity Ended");
}
}
