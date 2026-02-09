package ArrayDequeue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseStringUsingAD {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	
	char[] arr = str.toCharArray();
	
	ArrayDeque<Character> ad = new ArrayDeque<Character>();
	
	for(int i = 0; i< arr.length;i++) {
		ad.add(arr[i]);
	}
	
	StringBuilder reverse = new StringBuilder();
	
	while(!ad.isEmpty()) {
		reverse.append(ad.removeLast());
	}
	
	System.out.println(reverse.toString());
	
}	
}
