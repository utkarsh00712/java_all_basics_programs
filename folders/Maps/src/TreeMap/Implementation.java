package TreeMap;


import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Implementation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	sc.nextLine();
	TreeMap<String, String> flights = new TreeMap<String, String>();
	for(int i = 0; i < n; i++) {
		String name = sc.nextLine();
		String time = sc.nextLine();
		flights.put(time, name);
	}
	
	String retrive = sc.next();
	String retriveName = flights.get(retrive);
	
	if(retriveName!= null) {
		System.out.println("Flight at " + retrive + ": " + retriveName );
	} else {
		System.out.println("No flight found at " + retrive);
	}
	sc.nextLine();
	String remove = sc.next();
	String removeName = flights.remove(remove);
	
	if(removeName!= null) {
		System.out.println("Flight removed " + removeName + " at " + remove);
	}
	
	if(flights.isEmpty()) {
		System.out.println("No flights found.");
	} else {
	   for(Entry<String, String> entry  : flights.entrySet()) {
		   System.out.println(entry.getKey() +" ->" + entry.getValue());
	   }
	}
}
}
