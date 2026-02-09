package Treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class AddingElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	sc.nextLine();
	TreeSet<String> ts = new TreeSet<String>();
	
	
	for(int i = 0; i <n; i++) {
		ts.add(sc.nextLine());
	}
	
	String newProduct = sc.nextLine();
	
	ts.add(newProduct);
	
	System.out.println("Sorted product List: " + ts);
	
	System.out.println("Number of unique products: " + ts.size());
}
}
