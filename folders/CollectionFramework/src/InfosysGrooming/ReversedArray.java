package InfosysGrooming;

import java.util.Scanner;

public class ReversedArray {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int arr[] = new int[sc.nextInt()];
	
	for(int i = 0; i <= arr.length-1; i++) {
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
	
	int arr2[] = new int[arr.length];
	int j = arr.length-1;
	
	for(int i = 0; i <= arr.length-1; i++) {
		arr2[j] = arr[i];
		j--;
	}
	
	System.out.print("[");
	for(int i=0; i<= arr2.length-1; i++) {
		System.out.print(arr2[i]);
		if(i != arr2.length-1) {
			System.out.print(", ");
		}
	}
	System.out.println("]");
}
}
