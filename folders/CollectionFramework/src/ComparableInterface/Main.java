package ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	sc.nextLine();
	
	ArrayList<Person> al = new ArrayList<> ();
	
	for(int i = 0; i < n; i++) {
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		
		
		al.add(new Person(name,age));
	}
	
	Collections.sort(al);
	
	for(Person person : al) {
		System.out.println(person);
	}
}
}
