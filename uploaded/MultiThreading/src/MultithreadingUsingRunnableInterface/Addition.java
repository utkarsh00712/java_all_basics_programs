package MultithreadingUsingRunnableInterface;

public class Addition implements Runnable {
@Override
public void run() {
 System.out.println("Addition Started ");
	int a = 10;
	int b = 20;
	int res = a+b;
	
	try {
		Thread.sleep(3000);
	} catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println(res);
	System.out.println("Addition Completed");
}
}
