package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemovingDuplicatesInArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int arr[] = new int[n];
	
	for(int i = 0; i <n ; i++) {
		arr[i] = sc.nextInt();
	}
	
	LinkedHashSet<Integer> lhs  = new LinkedHashSet<Integer>();
	for(int i = 0; i < n; i++) {
		lhs.add(arr[i]);
	}
	for(int x: lhs) {
		System.out.print(x+" " );
	}
}
}
