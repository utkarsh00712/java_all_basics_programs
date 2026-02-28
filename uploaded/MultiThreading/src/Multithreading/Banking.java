package Multithreading;

import java.util.Scanner;

public class Banking extends Thread {
 @Override
public void run() {
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
}
