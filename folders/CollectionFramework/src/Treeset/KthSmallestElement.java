package Treeset;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class KthSmallestElement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	TreeSet <Integer> ts  = new TreeSet<Integer>();
	
	for(int i = 0; i <n; i++) {
		ts.add(sc.nextInt());
	}
	
	int k = sc.nextInt();
	
    ArrayList<Integer> list = new ArrayList<Integer>(ts);
    
    System.out.println(list.get(k-1));
    
}
}
