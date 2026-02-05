package ArrayPractice;

import java.util.Scanner;

public class AverageOfArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int arr[] = new int[sc.nextInt()];
	int sum = 0;
	for(int i = 0; i <= arr.length-1; i++) {
		arr[i] = sc.nextInt();
	}
	
	System.out.print("[");
	for(int i = 0; i <= arr.length-1; i++) {
		sum+= arr[i];
		System.out.print(arr[i]);
		
		if(i != arr.length-1) {
			System.out.print(", ");
		}
	}
	System.out.println("]");
	
	
	int avg = sum/ arr.length;

	System.out.println("average: "+avg);
}
}
