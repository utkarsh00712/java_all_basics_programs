package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Demo {
public static void main(String[] args) {
//	Cnanot predict the order
	HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
	hm.put(100,new Employee(101,"Utkarsh",95000));
	hm.put(50,new Employee(101,"Anand",85000));
	hm.put(150,new Employee(101,"Sahil",75000));
	System.out.println(hm);
	
	HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
	hm2.put(86,"Anand");
	hm2.put(46,"Aadyar");
	hm2.put(23,"Bhavya");
	System.out.println(hm2);
	
	// in the insertion order of keys
   LinkedHashMap<Integer, String> hm3 = new LinkedHashMap<Integer, String>();
	hm3.put(86,"Anand");
	hm3.put(46,"Aadyar");
	hm3.put(23,"Bhavya");
	System.out.println(hm3);
	
	// Sorted key values
	TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
	tm.put(86,"Anand");
	tm.put(46,"Aadyar");
	tm.put(23,"Bhavya");
	System.out.println(tm);
	
	
}
}
