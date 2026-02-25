package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ImplementHashMap {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Create a HashMap to store employee records
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        		
        int n = sc.nextInt();
        
        for(int i = 0; i <n; i++) {
        	int id = sc.nextInt();
        	String name = sc.next();
        	hm.put(id, name);
        	System.out.println("Added ID: " + id +"-> " + name );
        }
        
        int retrivedId = sc.nextInt();
        String retivrdName = hm.get(retrivedId);
        
        if(retivrdName!=null) {
        	System.out.println("Employee name = " + retivrdName);
        } else {
        	System.out.println("Employee Not Found");
        }

        int removeId = sc.nextInt();
        String removedEmployee = hm.remove(removeId);
        
        if(removedEmployee!= null) {
        	System.out.println("Employye Removed: " + removedEmployee);
        } else {
        	System.out.println("No Employye Removed");
        }
        
        if(hm.isEmpty()) {
        	System.out.println("No records found.");
        } else {
        	for(Map.Entry<Integer, String> entry: hm.entrySet()) {
        		System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue() );
        	}
        }
        sc.close();
    }
}
