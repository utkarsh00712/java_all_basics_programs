package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SwapArrayList {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	ArrayList<String> al = new ArrayList<String>();
	
	
	
	for(int i = 0; i <n;i++) {
		al.add(sc.next());
	}
	
	System.out.println("ArrayList before swap: ");
	for(String x: al) {
		System.out.println(x+" ");
	}
	
	Collections.swap(al, 0, 2);
	
	System.out.println("ArrayList after swap: ");
	for(String x: al) {
		System.out.println(x +" ");
	}
}
}
