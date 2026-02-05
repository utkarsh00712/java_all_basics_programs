package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	
	al.add("Utkasrh");
	al.add(100);
	al.add(3.4);
	al.add(true);
	Collections.sort(al);
	System.out.println(al);
	
}
}
