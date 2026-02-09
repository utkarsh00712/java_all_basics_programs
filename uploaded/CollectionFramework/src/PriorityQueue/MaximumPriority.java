package PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumPriority {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	
	for(int  i = 0; i < n; i++) {
		pq.add(sc.nextInt());
	}
	
	int maxPrior = sc.nextInt();
	pq.add(maxPrior);
	
	
	
	PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(pq);
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	while(!pq1.isEmpty()) {
		al.add(pq1.poll());
	}
	Collections.reverse(al);
	al.removeFirst();
	for(Integer x: al) {
		System.out.print(x+" ");
	}
	
}
}
