package MultithreadingUsingRunnableInterface;

import java.util.Scanner;

public class Banking implements Runnable {
@Override
public void run() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Banking app Started");
	int pass = 1234;
	int userPwd = sc.nextInt();
	try {
		Thread.sleep(3000);
	} catch(Exception e) {
		e.printStackTrace();
	}
	if(pass==userPwd) {
		System.out.println("Authentication Successful");
	} else {
		System.out.println("Authentication Denied");
	}
	
}
}
