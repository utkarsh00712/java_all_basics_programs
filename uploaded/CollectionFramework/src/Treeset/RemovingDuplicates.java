package Treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class RemovingDuplicates {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	TreeSet<Integer> ts = new TreeSet<Integer>();
	
	for(int i = 0; i < n; i++) {
		ts.add(sc.nextInt());
	}
	
	if(!ts.isEmpty()) {
	for(int x : ts) {
		System.out.print(x+" ");
	}
	} else {
		System.out.println("No elements");
	}
	
}
}
