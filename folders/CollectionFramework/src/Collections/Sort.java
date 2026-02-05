package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(100);
	al.add(50);
	al.add(150);
	al.add(170);
	al.add(125);
	al.add(175);
	System.out.println("Before Sorting");
	System.out.println(al);
	Collections.sort(al);
	System.out.println("After Sorting");
	System.out.println(al);
	Collections.reverse(al);
	System.out.println("Descending Order");
	System.out.println(al);
}
}
