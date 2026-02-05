package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add(100);
	ll.add(200);
	ll.add(300);
	ll.add(400);
	ll.add(500);
	ll.add("Ramu");
	ll.add(3.147);
	System.out.println("ll Size-->" + ll.size());
	System.out.println(ll);
	ll.addFirst(9);
	System.out.println("ll Size-->" + ll.size());

	System.out.println(ll);
	ll.add(3,999);
	System.out.println("ll Size-->" + ll.size());

	System.out.println(ll);
	
	ArrayList al = new ArrayList();
	al.add(8);
	al.add(88);
	al.add(888);
	System.out.println("al Size-->" + al.size());
	System.out.println(al);
	System.out.println(ll);
	
	ll.add(al); // Adding ArrayList to linkedList
	System.out.println(ll);
	ll.addAll(0,al);
	System.out.println(ll); // adding ArrayList To 0th index of LinkedList 
	System.out.println(al.containsAll(ll));
	System.out.println(ll.containsAll(al));
	
	LinkedList stack = new LinkedList(); // creating new LinkedList as stack
	stack.push(100);
	stack.push(200);
	stack.push(300);
	stack.push(400);
	System.out.println("ll as stack-->" + stack);
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	
	// Creating new LinkedList as queue
	LinkedList queue = new LinkedList();
	queue.add(9);
	queue.add(99);
	queue.add(999);
	queue.add(9999);
	System.out.println("ll as queue-->" + queue);
	
	System.out.println(queue.remove());
	System.out.println(queue.remove());
	System.out.println(queue.remove());
	System.out.println(queue.remove());
	
	
}
}
