package Treeset;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class PriceRange {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	TreeSet<Integer> ts = new TreeSet<Integer>();
	
	for(int i = 0; i < n; i++) {
		ts.add(sc.nextInt());
	}
	
	int minPrice = sc.nextInt();
	int maxPrice = sc.nextInt();
	
	
	SortedSet<Integer> s = ts.subSet(minPrice, maxPrice+1);
	if(s.isEmpty()) {
		System.out.println("NO PRODUCTS");
	} else {
		for(Integer x: s) {
			System.out.print(x +" ");
		}
	}
}
}
