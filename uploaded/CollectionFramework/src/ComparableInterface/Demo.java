package ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Demo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	
	ArrayList<CustomString> al = new ArrayList<CustomString>();
	for(int i = 0; i < n; i++) {
		String s = sc.next();
		al.add(new CustomString(s));
	}
	
	Collections.sort(al);
	Collections.reverse(al);
	for(CustomString c: al) {
		System.out.println(c);
	}
}
}
