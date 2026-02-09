package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class CountNumberOfElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	
	
	for(int i = 0; i <n; i++) {
		pq.add(sc.nextInt());
		
	}
	int n1 = sc.nextInt();
	pq.add(n1);
	
	int count = 0;
	while(!pq.isEmpty()) {
		pq.poll();
		count++;
	}
	System.out.println(count);
}
}
