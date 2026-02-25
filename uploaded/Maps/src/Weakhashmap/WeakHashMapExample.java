package Weakhashmap;

import java.util.WeakHashMap;

public class WeakHashMapExample {
public static void main(String[] args) {
	WeakHashMap<Object, String> restaurantCache = new WeakHashMap<Object, String>();
	
	Object key1 = new Object();
	
	restaurantCache.put(key1, "The Spict grill -> Treanding Today");
	System.out.println("Befor gc -> " + restaurantCache);
	
	key1 = null;
	System.gc();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("After GC -> " + restaurantCache);
}
}
