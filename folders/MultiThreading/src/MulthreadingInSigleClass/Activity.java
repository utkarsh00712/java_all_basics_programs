package MulthreadingInSigleClass;

import java.util.Scanner;

public class Activity extends Thread {
 @Override
public void run() {
	 
	String name =  Thread.currentThread().getName();
	if(name.equals("bank")) {
	banking();
	} else if(name.equals("print")) {
	printing();
	} else {
	addition();
	}
	
}
 
 void banking() {
	 System.out.println("Banking Authentication Started");
	 Scanner sc = new Scanner(System.in);
	 
	 int pwd = 1234;
	 int usepwd = sc.nextInt();
	 
	 try {
		 Thread.sleep(3000);
	 } catch(Exception e) {
		 e.printStackTrace();
	 }
	 
		 
	 if(pwd==usepwd) {
		 System.out.println("Authentication Successful.");
	 } else {
		 System.out.println("Authentication Failed pls try again");
	 }
	 System.out.println("Banking Authentication Finished");
 }
 
 void printing() {
	 System.out.println("Printing Started");
	 for(int i = 0; i <=10; i++) {
		 try {
			 Thread.sleep(1000);
		 } catch(Exception e) {
			 e.printStackTrace();
		 }
		System.out.println("Hello"); 
	 }
	 System.out.println("Printing Ended");
 }
 
 void addition() {
	 System.out.println("Addition Started");
	 int a = 10;
	 int b = 50;
	 int res = a+b;
	 try {
		 Thread.sleep(3000);
	 } catch(Exception e) {
		 e.printStackTrace();
	 }
	 System.out.println(res);
	 System.out.println("Addition Ended");
 }
}
