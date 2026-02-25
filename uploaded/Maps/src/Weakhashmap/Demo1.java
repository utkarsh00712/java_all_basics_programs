package Weakhashmap;

import java.util.WeakHashMap;

public class Demo1 {
public static void main(String[] args) {
	
	String s1 = new String("A");
	String s2 = new String("A");
	String s3 = new String("A");
	String s4 = new String("A");
	WeakHashMap<String, Integer> whm = new WeakHashMap<String, Integer>();
	whm.put(s1, 1000);
	whm.put(s2, 2000);
	whm.put(s3, 3000);
	whm.put(s4, 4000);
	whm.put(new String("Z"), 5000);
	System.out.println(whm);
	System.gc();
	System.out.println(whm);
	
}
}
