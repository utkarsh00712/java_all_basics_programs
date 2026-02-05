package Synchonization;

public class BathRoom implements Runnable {
@Override
synchronized public void run() {
String name = 	Thread.currentThread().getName();
try {
System.out.println(name + " is entering the Bathroom");
Thread.sleep(2000);
 admire();
System.out.println(name + " is using the Bathroom");
Thread.sleep(2000);

System.out.println(name + " is Exiting the bathroom");
Thread.sleep(2000);
} catch(Exception e) {
	e.printStackTrace();
}
}

synchronized public void admire() {
	try {
	 System.err.println(Thread.currentThread().getName() + " is admiring the interior of the Bathroom");
	 Thread.sleep(2000);
	} catch(Exception e) {
		e.printStackTrace();
	}
}
}
