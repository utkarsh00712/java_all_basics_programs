package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class GetOccurance {
public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	LinkedList< String> ll = new LinkedList();
	
	
	for(int i = 0; i <n; i++) {
		ll.add(sc.next());
	}
	sc.nextLine();
	
	String title = sc.nextLine();
	
	if(ll.contains(title)) {
		System.out.println("First occurrance of " + title + " is: ");
		System.out.println(ll.indexOf(title));
		
		System.out.println("Last occurrance of " + title + " is: ");
		System.out.println(ll.lastIndexOf(title));
	} else {
		System.out.println("Invalid title");
	}
}
}
