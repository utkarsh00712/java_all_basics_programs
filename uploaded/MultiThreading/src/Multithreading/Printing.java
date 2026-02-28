package Multithreading;

public class Printing extends Thread {
@Override
public void run() {
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
}
