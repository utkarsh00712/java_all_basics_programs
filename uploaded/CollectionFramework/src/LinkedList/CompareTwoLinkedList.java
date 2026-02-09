package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class CompareTwoLinkedList {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n1 = sc.nextInt();
	
	LinkedList<Integer> ll1 = new LinkedList();
	
	for(int i = 0; i <n1; i++) {
		ll1.add(sc.nextInt());
	}
	
	int n2 = sc.nextInt();
	
LinkedList<Integer> ll2 = new LinkedList();
	
	for(int i = 0; i <n2; i++) {
		ll2.add(sc.nextInt());
	}
	
	if(ll1.equals(ll2)) {
		System.out.println("The two linked lists are identical");
	} else {
		System.out.println("The two linkedList are not identical");
	}
	 
}
}
