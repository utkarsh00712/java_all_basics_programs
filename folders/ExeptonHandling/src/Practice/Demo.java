package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	
	try (Scanner sc = new Scanner(System.in);){
	System.out.println("Enter two numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int res = a/b;
	
	System.out.println(res);
	
	System.out.println("Enter Array Size");
	int arr[] = new int[sc.nextInt()];
	
	System.out.println("Enter Element and position");
	int elem = sc.nextInt();
	int posi = sc.nextInt();
	
	arr[posi]  = elem;
	System.out.println(arr[posi]);
	} catch( IndexOutOfBoundsException | NegativeArraySizeException| ArithmeticException| InputMismatchException e) {
		e.printStackTrace();
	} catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
