package ArrayDequeue;

import java.util.ArrayDeque;
import java.util.Scanner;



public class ArrayDequeAsStack {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
	
	for(int i = 0; i < n; i++) {
		stack.addFirst(sc.nextInt());
	}
	System.out.println(stack);
	
	for(int i = n; i>0;i--) {
	System.out.println(	stack.pollLast());
	}
}
}
