package Deadlock;

public class Warrior implements Runnable {
	
	String resource1 = "sarpastra";
	String resource2 = "Garudastra";
	String resource3 = "Pashupatastra";
@Override
public void run() {
	String name = Thread.currentThread().getName();
	
	if(name.equals("Karna")) {
		karnaAcquireResource();
	} else {
		arjunaAcquireResource();
	}
	
}

public void karnaAcquireResource() {
	try {
	Thread.sleep(5000);
	synchronized (resource1) {
		System.out.println(Thread.currentThread().getName() + " has aquired " + resource1);
		Thread.sleep(5000);
	synchronized (resource2) {
		System.out.println(Thread.currentThread().getName() + " has aquired " + resource2);
		Thread.sleep(5000);
	synchronized (resource3) {
		System.out.println(Thread.currentThread().getName() + " has aquired " + resource3);
		Thread.sleep(5000);
	}	
	}	
	}
	} 
	catch(Exception e) {
		e.printStackTrace();
	}
}

public void arjunaAcquireResource() {
	try {
	Thread.sleep(5000);
	synchronized (resource3) {
		System.out.println(Thread.currentThread().getName() + " has aquired " + resource3);
		Thread.sleep(5000);
	synchronized (resource2) {
		System.out.println(Thread.currentThread().getName() + " has aquired " + resource2);
		Thread.sleep(5000);
	synchronized (resource1) {
		System.out.println(Thread.currentThread().getName() + " has aquired " + resource1);
		Thread.sleep(5000);
	}	
	}	
	}
	} 
	catch(Exception e) {
		e.printStackTrace();
	}
}


}
