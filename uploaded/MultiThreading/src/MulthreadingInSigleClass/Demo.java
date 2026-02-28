package MulthreadingInSigleClass;

public class Demo {
public static void main(String[] args) {
	System.out.println("Main method Excecution Started");
	Task t1 = new Task();
	Task t2 = new Task();
	Task t3 = new Task();
	
	t1.setName("Task1");
	t2.setName("Task2");
	t3.setName("Task3");
	
	t1.start();
	t2.start();
	t3.start();
	
	System.out.println(t1.isAlive());
	System.out.println(t2.isAlive());
	System.out.println(t3.isAlive());
	
	
	try {
	t1.join();
	t2.join();
	t3.join();
	} catch(InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println(t1.isAlive());
	System.out.println(t2.isAlive());
	System.out.println(t3.isAlive());
	
	System.out.println("Main method Excecution Ended");
}
}
