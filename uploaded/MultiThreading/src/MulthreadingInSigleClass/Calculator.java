package MulthreadingInSigleClass;

import java.util.Scanner;

public class Calculator implements Runnable {
 @Override
 
public void run() {
	 String name = Thread.currentThread().getName();
	if(name.equals("add")) {
		add();
	} else if(name.equals("sub")) {
		subtract();
	} else {
		mul();
	}
	
}
 
 void add() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter 1st number for Addition");
	 int num1 = sc.nextInt();
	 System.out.println("Enter 2nd number for Addition");
	 int num2 = sc.nextInt();
	 int addres = num1+ num2;
	 
	 try {
		 Thread.sleep(3000);
	 } catch(InterruptedException e) {
		 e.printStackTrace();
	 }
	 System.out.println("Addition result is: " +addres);
 }

 void subtract() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter 1st number for Subtraction");
	 int num1 = sc.nextInt();
	 System.out.println("Enter 2nd number for Subtraction");
	 int num2 = sc.nextInt();
	 int subres = num1 - num2;
	 
	 try {
		 Thread.sleep(3000);
	 } catch(InterruptedException e) {
		 e.printStackTrace();
	 }
	 System.out.println("Subtraction result is: " +subres);
 }
 
 void mul() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter 1st number for Multiplication");
	 int num1 = sc.nextInt();
	 System.out.println("Enter 2nd number for Multiplication");
	 int num2 = sc.nextInt();
	 int mulres = num1 * num2;
	 
	 try {
		 Thread.sleep(3000);
	 } catch(InterruptedException e) {
		 e.printStackTrace();
	 }
	 System.out.println("Multiplication result is: " +mulres);
 }
}
