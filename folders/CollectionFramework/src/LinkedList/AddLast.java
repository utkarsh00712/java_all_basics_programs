package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AddLast {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	LinkedList ll = new LinkedList();
	
	int n = sc.nextInt();
	
	sc.nextLine();
	for(int i = 0; i <= n-1; i++) {
		ll.addLast(sc.nextLine());
	}
	
	System.out.println("Queue Size: " + n);
	System.out.println("Customers: ");
	Iterator itr = ll.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
