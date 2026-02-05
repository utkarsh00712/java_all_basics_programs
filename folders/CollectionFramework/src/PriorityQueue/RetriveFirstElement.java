package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class RetriveFirstElement {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int n = sc.nextInt();
	 
	 PriorityQueue<Integer> ticket = new PriorityQueue<Integer>();
	 
	 for(int i = 0; i <n; i++) {
		 ticket.add(sc.nextInt());
	 }
	 
	 int ticketPrior = sc.nextInt();
	 
	 ticket.add(ticketPrior);
	 
  System.out.println("First elemnt in Priority Queue is: " + ticket.poll());
	 
}
}
