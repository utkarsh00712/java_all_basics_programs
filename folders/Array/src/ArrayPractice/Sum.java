package ArrayPractice;

import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[sc.nextInt()];
	
	for(int i = 0; i <= arr.length-1; i++) {
	  arr[i] = sc.nextInt();
	}
	
	int sum = 0; 
	System.out.print("[");
	for(int i =0; i <= arr.length-1; i++) {
		System.out.print(arr[i]);
		if(i != arr.length-1) {
			System.out.print(", ");
		}
		sum = sum + arr[i];
	}
	System.out.println("] ");
	System.out.println("Sum: " + sum);
}

}
