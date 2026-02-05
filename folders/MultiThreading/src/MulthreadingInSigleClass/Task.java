package MulthreadingInSigleClass;

public class Task extends Thread {

public void run() {
	String task =  Thread.currentThread().getName();
	
	if(task.equals("Task1")) {
		task1();
	} else if(task.equals("Task2")) {
		task2();
	} else {
		task3();
	}
}

void task1() {
	System.out.println("Taks 1 Started");
	for(int i = 0; i <= 5; i++) {
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Task 1 is getting Executed");
	}
	System.out.println("Task 1 Ended");
}
void task2() {
	System.out.println("Task 2 Started");
	for(int i = 0; i <= 5; i++) {
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Task 2 is getting Executed");
	}
	System.out.println("Taks 2 Ended");
}
void task3() {
	System.out.println("Taks 3 Started");
	for(int i = 0; i <= 5; i++) {
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Task 3 is getting Executed");
	}
	System.out.println("Taks 3 Ended");
}
}
