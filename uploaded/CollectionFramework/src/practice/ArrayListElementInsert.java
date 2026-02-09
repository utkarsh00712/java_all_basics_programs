package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListElementInsert {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	ArrayList al = new ArrayList();
	
	for(int i = 0; i < n; i++) {
		al.add(sc.nextInt());
	}
	System.out.println(n);
	
	Iterator itr = al.iterator();
	
	int count = 0;
	System.out.print("[");
	while(itr.hasNext()) {
		System.out.print(itr.next());
		if(count != al.size()-1) {
			System.out.print(", ");
			count++;
		}
		} System.out.println("]");
//	System.out.print("[");
//	for(int i = 0; i <= al.size()-1; i++) {
//		System.out.print(al.get(i));
//		if(i != al.size()-1) {
//			System.out.print(", ");
//		}
//	}
//	System.out.println("]");
}
}
