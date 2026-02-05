package CollectionsUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	
	al.add(100);
	al.add(150);
	al.add(175);
	al.add(25);
	al.add(75);
	al.add(125);
	System.out.println("al-->" + al);
    Collections.sort(al);	
    System.out.println("al-->" + al);
    Collections.reverse(al);
    System.out.println("al-->" + al);
    ArrayList al2 = new ArrayList();
    al2.add(86);
    al2.add(42);
    al2.add(32);
    al2.add(56);
    al2.add(76);
    al2.add(25);
    al2.add(25);
    
    System.out.println("al-->" + al2);
  Comparator comparator =   Collections.reverseOrder();
  Collections.sort(al2,comparator);
  System.out.println("al-->" + al2);
  System.out.println(Collections.min(al2));
  System.out.println(Collections.max(al2));
  System.out.println(Collections.frequency(al2, 25));
  System.out.println(Collections.frequency(al2, 250));
  Collections.sort(al2);
  System.out.println(Collections.binarySearch(al2, 86));
  System.out.println(Collections.disjoint(al, al2));
}
}
