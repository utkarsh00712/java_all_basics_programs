package Introduction;

import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	System.out.println("CONNECTION TO SERVER ESTABLISHED");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers for Division");
	
	try {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = a/b;
		System.out.println("The Quotient of a and b is" + q);
		
		System.out.println("Enter array Size");
		int size = 0;
		int arr[] =  null;
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Enter the element to insert into array");
		int index = 0;
		int elem = sc.nextInt();
		System.out.println("Enter the position to insert in array");
		index = sc.nextInt();
		arr[index]  = elem;
		System.out.println("Element at index " + index + " is " + arr[index]);
	} 
	catch(ArithmeticException e) {
		System.out.println("ArithmaticExeption at line no 14");
	} 
	catch(NegativeArraySizeException e) {
		System.out.println("NegativeArraySizeException at line no 20");
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException at line no 27");
	} catch(Exception e) {
		System.out.println("We are extremely sorry some error has occured");
	} 
	System.out.println("CONNECTION TO SERVER TERMINATED");
}
}
