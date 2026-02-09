package HashSet;

import java.util.HashSet;

public class EmployeeApp {
public static void main(String[] args) {
	Employee e1 = new Employee(12,"Sandhya",95000);
	Employee e2 = new Employee(13,"Saurabh",85000);
	Employee e3 = new Employee(14,"Sandhya",75000);
	Employee e4 = new Employee(12,"Sandhya",95000);
	Employee e5 = new Employee(15,"Sandhya",65000);
	
	HashSet<Employee> hs = new HashSet<Employee>();
	hs.add(e1);
	hs.add(e2);
	hs.add(e3);
	hs.add(e4);
	hs.add(e5);
	
if(e1.equals(e4)) {
	System.out.println(hs);
}
	
}
}
