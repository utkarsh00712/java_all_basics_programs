package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class App {
public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	hm.put(100, "Akhil");
	hm.put(50, "Arghya");
	hm.put(150, "Anand");
	hm.put(25, "Anil");
	System.out.println(hm);
	 
	Set <Integer> keys =hm.keySet();
	Iterator<Integer> itr = keys.iterator();
	
	while(itr.hasNext()) {
		System.out.print(itr.next()+" "); // for keys
	}
	System.out.println();
Collection<String> value = 	hm.values();
Iterator<String> itr1 = value.iterator();
while(itr1.hasNext()) {
	System.out.print(itr1.next() +" ");
}

System.out.println();
   Set KeyValue = hm.entrySet();
   
   Iterator itr3 = KeyValue.iterator();
   while(itr3.hasNext()) {
	   System.out.print(itr3.next()+" ");
   }
}
}
