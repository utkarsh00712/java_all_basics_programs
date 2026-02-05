package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class FindCommonElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n1 = sc.nextInt();
	sc.nextLine();
	LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
	for(int i = 0; i < n1; i++) {
		lhs1.add(sc.next());
	}
	
	int n2 = sc.nextInt();
	sc.nextLine();
	LinkedHashSet<String> lhs2 = new LinkedHashSet<String>();
	for(int i = 0; i < n2; i++) {
		lhs2.add(sc.next());
	}
	
	
	lhs1.retainAll(lhs2);
	
	if(lhs1.isEmpty()) {
		System.out.println("No common Elements");
	} else {
		for (String x: lhs1) {
			System.out.println(x);
			
		}
	}
	
}
}
