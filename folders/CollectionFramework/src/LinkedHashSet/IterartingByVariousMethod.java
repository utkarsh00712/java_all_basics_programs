package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class IterartingByVariousMethod {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	sc.nextLine();
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	for(int i = 0; i < n; i++) {
		lhs.add(sc.nextLine());
	}
	// By using For Each Loop
	for(String x: lhs) {
		System.out.println(x);
	}
	// By using Iterator
	
	Iterator<String> itr = lhs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
