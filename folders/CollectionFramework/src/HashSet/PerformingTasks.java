package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class PerformingTasks {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	HashSet <Integer> employeeIds = new HashSet<Integer>();
	for(int i = 0; i < n; i++) {
		employeeIds.add(sc.nextInt());
	}
	
	System.out.println();
	
	while(true) {
	String operation = sc.next();
	
	if(operation.equalsIgnoreCase("ADD")) {
		int id = sc.nextInt();
		employeeIds.add(id);
		System.out.println(employeeIds);
	} 
	
	else if(operation.equalsIgnoreCase("REMOVE")) {
		int id = sc.nextInt();
		employeeIds.remove(id);
		System.out.println(employeeIds);
	} 
	
	else if(operation.equalsIgnoreCase("CHECK")) {
		
		int id = sc.nextInt();
		if(employeeIds.contains(id)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	else if(operation.equalsIgnoreCase("PRINT")) {
		System.out.println(employeeIds);
	} 
	else if(operation.equalsIgnoreCase("STOP")) {
		break;
	} 
	else {
		System.out.println("Invalid Operation");
	}
	}
}
}
