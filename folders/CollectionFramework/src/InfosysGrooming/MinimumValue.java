package InfosysGrooming;

import java.util.Scanner;

public class MinimumValue {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int arr[] = new int [sc.nextInt()];
	
	for(int i = 0; i <= arr.length-1;i++) {
		arr[i] = sc.nextInt();
	}
	
	System.out.print("[");
	for(int i = 0; i<= arr.length-1; i++) {
		System.out.print(arr[i]);
		if(i != arr.length-1) {
			System.out.print(", ");
		}
	}
	System.out.println("]");
	
	int min = arr[0]; 
	for(int i = 0; i <= arr.length-1; i++) {
		if(min > arr[i]) {
			min = arr[i];
		}
	}
	System.out.println(min);
}
}
