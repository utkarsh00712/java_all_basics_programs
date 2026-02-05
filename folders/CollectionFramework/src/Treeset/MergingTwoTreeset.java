package Treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class MergingTwoTreeset {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n1 = sc.nextInt();
	TreeSet<Integer> ts  = new TreeSet<Integer>();
	
	for(int i = 0; i <n1; i++) {
		ts.add(sc.nextInt());
	}
	
	int n2 = sc.nextInt();
	
	for(int i = 0; i <n2; i++) {
		ts.add(sc.nextInt());
	}
	
	if(n1==0 && n2==0) {
		System.out.println("No elements");
	} else {
		for(Integer x: ts) {
			System.out.print(x+" ");
		}
	}
}
}
