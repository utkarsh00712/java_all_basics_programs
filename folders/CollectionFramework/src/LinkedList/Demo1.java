package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	LinkedList ll  = new LinkedList();
	for(int i  = 0; i <= n-1; i++) {
		ll.add(sc.nextInt());
	}
	
	
	Iterator itr = ll.iterator();
	System.out.print("[");
	int count = 0;
	while(itr.hasNext()) {
		System.out.print(itr.next());
		if(count!=ll.size()-1) {
			System.out.print(", ");
		}
		count++;
	}
	System.out.println("]");
}
}
