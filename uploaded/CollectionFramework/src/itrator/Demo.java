package itrator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	
	al.add(100);
	al.add(150);
	al.add(200);
	al.add(25);
	al.add(50);
	al.add(75);
	al.add(175);
	
	System.out.println(al);
	
	// Print using for loop
	System.out.print("[");
	for(int i = 0; i<= al.size()-1; i++) {
		System.out.print(al.get(i) + " ");
		if(i != al.size()-1) {
			System.out.print(", ");
		}
	} System.out.println("]");
	
	// Print using forEach Loop
	int count = 0;
	
	for(Object x: al) {
		System.out.print(x + " ");
	 
	if(count != al.size()-1) {
		System.out.print(", ");
		count++;
	}
	}System.out.println("]");
// Print by using Iterator
	Iterator itr = al.iterator();
	System.out.print("[");
	 count = 0;
	 while(itr.hasNext()) {
		 System.out.print(itr.next() + " ");
		 if(count != al.size()-1) {
			 System.out.print(", ");
			 count++;
		 } 
	 }
	 System.out.println("]");
} 
}

