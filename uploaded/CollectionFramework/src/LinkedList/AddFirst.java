package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class AddFirst {
public static void main(String[] args) {
	
	Scanner  sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	LinkedList ll = new LinkedList();
	
	sc.nextLine();
	for(int i = 0; i <= n-1; i++) {
		ll.addFirst(sc.nextLine());
	}
	
	System.out.println("Number of Elements in LinkedList: " + n);
	for(Object x:ll ) {
		 System.out.println(x);
	}
}
}
