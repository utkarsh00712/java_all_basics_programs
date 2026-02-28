package MultithreadingUsingRunnableInterface;

public class Printing implements Runnable {
@Override
public void run() {
	System.out.println("Printing Started");
	for(int i = 0; i <= 10; i++) {
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
	System.out.println("Printing Finished");
}
}
