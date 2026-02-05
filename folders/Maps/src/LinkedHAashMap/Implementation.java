package LinkedHAashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Implementation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	LinkedHashMap<Integer, String> Students = new LinkedHashMap<Integer, String>();
	
	for(int i = 0; i <n; i++) {
		int roll = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		Students.put(roll, name);
		System.out.println("Added: Roll " + roll + " -> " + name);
	}
	
	int retrive = sc.nextInt();
 String retriveName = 	Students.get(retrive);
 
 if(retriveName!=null) {
	 System.out.println("Student name: " + retriveName);
 } else {
	 System.out.println("Student not found.");
 }
 
  int remove = sc.nextInt();
  String removeName = Students.remove(remove);
  
  if(removeName!=null) {
	  System.out.println("Student Removed: " + removeName);
  }
  
 if(Students.isEmpty()) {
	 System.out.println("No records found.");
 } else {
	 for(Entry<Integer,String> entry: Students.entrySet()) {
		 System.out.println("Roll: " + entry.getKey() +", Name: "+ entry.getValue());
	 }
 }
}
}
