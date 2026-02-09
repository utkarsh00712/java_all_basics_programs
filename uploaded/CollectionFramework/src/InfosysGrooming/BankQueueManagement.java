package InfosysGrooming;

import java.util.LinkedList;
import java.util.Scanner;

public class BankQueueManagement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	sc.nextLine();
	
	String [] arr = new String[n];
	
	for(int i = 0; i <= arr.length-1; i++) {
		arr[i] = sc.nextLine();
	}
	System.out.println(banking(arr));
}
public static String banking(String[]arr) {
	
	LinkedList<String> queue = new LinkedList<String>();
	
	for(int i = 0; i <= arr.length-1; i++) {
		String op = arr[i];
		
		if(op.startsWith("ENQUEUE")) {
			String [] parts = op.split(" ");
			queue.addLast(parts[1]);
		} else if(op.startsWith("DEQUEUE")) {
			if(queue.isEmpty() == false) {
				queue.removeFirst();
			}
		}
	}
	if(queue.isEmpty()) {
		return "EMPTY";
	} else  {
		String result =  String.join(" ", queue);
		return result;
	}
	
}
}
