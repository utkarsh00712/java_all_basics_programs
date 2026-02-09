package ArrayList;

import java.util.ArrayList;

public class Demo {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(100);
	System.out.println("size--> " + al.size());
	al.add(200);
	System.out.println("size--> " + al.size());
	al.add(150);
	al.add(75);
	al.add(25);
	al.add(125);
	al.add(20);
	System.out.println("size--> " + al.size());
	al.add("Utkarsh");
	al.add('X');
	al.add(true);
	al.add(3.147f);
	System.out.println("size--> " + al.size());
	System.out.println(al);
	al.add(2,999);
	System.out.println(al);
	System.out.println(al.contains(999));
	System.out.println(al.get(2));
	System.out.println(al.indexOf(999));
	System.out.println(al.isEmpty());
	System.out.println(al.getFirst());
	System.out.println(al.getLast());
	System.out.println("size--> " + al.size());
	System.out.println(al.remove(2));
	System.out.println("size--> " + al.size());
	System.out.println(al);
}
}
