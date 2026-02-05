package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n  = sc.nextInt();
	
	PriorityQueue <Integer> pq = new PriorityQueue<Integer>();
	
	for(int i  = 0; i <= n-1; i++) {
		pq.add(sc.nextInt());
	}
	
	pq.add(sc.nextInt());
	pq.poll();
	
	System.out.println("Updated task of PriorityQueues: ");
	PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(pq);
	
	while(!pq1.isEmpty()) {
		System.out.print(pq1.poll() +" ");
	}
	
}
}
