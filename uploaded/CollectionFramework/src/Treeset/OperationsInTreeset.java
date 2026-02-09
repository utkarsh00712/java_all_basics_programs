package Treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class OperationsInTreeset {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n1 = sc.nextInt();
	sc.nextLine();
	TreeSet<String> Electronics = new TreeSet<String>();
	
	for(int i = 0; i <n1; i++) {
		Electronics.add(sc.next());
	}
	
	int n2 = sc.nextInt();
	sc.nextLine();
	
	TreeSet<String> homeAppliances = new TreeSet<String>();
	for(int i = 0; i < n2; i++) {
	homeAppliances.add(sc.next());	
	}
	
	TreeSet<String> union  = new TreeSet<String>(Electronics);
	union.addAll(homeAppliances);
	for(String x: union) {
		System.out.print(x+" ");
	}
	System.out.println();
	TreeSet<String> InterSection  = new TreeSet<String>(Electronics);
	InterSection.retainAll(homeAppliances);
	for(String x: InterSection) {
		System.out.print(x+" ");
	}
	System.out.println();
	TreeSet<String> Difference  = new TreeSet<String>(Electronics);
	Difference.removeAll(homeAppliances);
	for(String x: Difference) {
		System.out.print(x+" ");
	}
	if(Difference.isEmpty()) {
		System.out.println("No Elements");
	}
	
	
	
	
}
}
