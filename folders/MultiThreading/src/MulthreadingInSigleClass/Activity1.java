package MulthreadingInSigleClass;

import java.util.Scanner;

public class Activity1 implements Runnable {
@Override
public void run() {
	String name = Thread.currentThread().getName();
	
	if(name.equals("bank")) {
	banking();
	} else if(name.equals("print")) {
		printing();
	} else {
		addition();
	}
	
}

void banking() {
	System.out.println("Banking Application Started");
	Scanner sc = new Scanner(System.in);
	
	int pwd = 1234;
	int usepwd = sc.nextInt();
	
	try {
		Thread.sleep(3000);
	} catch(Exception e) {
		e.printStackTrace();
	}
	if(pwd==usepwd) {
		System.out.println("authentication Successful");
	} else {
		System.out.println("Authentication failed");
	}
	System.out.println("Banking App Closed");
}

void printing() {
	System.out.println("Printing Started");
	
	for(int i = 0; i <= 10; i++) {
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}

void addition() {
	
int a = 10;
int b = 30;
int res = a+b;

try {
	Thread.sleep(3000);
} catch(Exception e) {
	e.printStackTrace();
}
System.out.println(res);
}
}
