package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FindElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	ArrayList<String> al = new ArrayList();
	
	sc.nextLine();
	for(int i  = 0; i <n; i++) {
		al.add(sc.next());
	}
	sc.nextLine();
	
	String elem = sc.nextLine();
	if(al.contains(elem)) {
	
	System.out.println("First ocuuracne of element " + elem + " is: ");
	System.out.println(al.indexOf(elem));
	System.out.println("Last ocuuracne of element " + elem + " is: ");
	System.out.println(al.lastIndexOf(elem));
	} else {
		System.out.println("Invalid input");
	}
	
}
}
