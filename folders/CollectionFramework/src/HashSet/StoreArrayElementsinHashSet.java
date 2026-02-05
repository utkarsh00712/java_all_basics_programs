package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class StoreArrayElementsinHashSet {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int arr [] = new int[n];
	
	for(int i = 0; i < arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	
	HashSet <Integer> hs = new HashSet<Integer>(); 
	
	for(int i = 0; i < n; i++) {
		hs.add(arr[i]);
	}
	
	for(Integer x :hs) {
		System.out.print(x+" ");
	}
}
}
