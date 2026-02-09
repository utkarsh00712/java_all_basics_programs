package ArrayDequeue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ImplementinArrayDequeue {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	
	int n = sc.nextInt();
	
	ArrayDeque <Integer> ad = new ArrayDeque<Integer>();
	
	for(int i = 0; i<n; i++) {
		ad.add(sc.nextInt());
	}
	
	int id1 = sc.nextInt();
	ad.addFirst(id1);
	
	int id2 = sc.nextInt();
	ad.addLast(id2);
	
	ad.pollFirst();
	ad.pollFirst();
	
	for(Integer x : ad) {
		System.out.println(x);
	}
}
}
