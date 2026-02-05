package COmparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
public static void main(String[] args) {
	Employee e1 = new Employee(101,"Utkarsh",500000);
	Employee e2 = new Employee(102,"Raghav",50000);
	Employee e3 = new Employee(103,"Harsh",45000);
	Employee e4 = new Employee(104,"Sahil",65000);
	Employee e5 = new Employee(105,"Anshul",75000);
	
	Demo1 d1 = new Demo1();
	int res = d1.compare(e4, e5);
	if(res>0) {
		System.out.println(e4 +" is greater based on salary");
	} else {
		System.out.println(e5 +" is greater based on salary");
	}
	
	Demo2 d2 = new Demo2();
	int res2 = d2.compare(e3, e2);
	
	if(res2>0) {
		System.out.println(e3 +" is greater based on the name");
	} else {
		System.out.println(e4+ " is greater based on name");
	}
	Demo3 d3 = new Demo3();
	int res3 = d2.compare(e1, e4);
	
	if(res3>0) {
		System.out.println(e1 +" is greater based on the id");
	} else {
		System.out.println(e4+ " is greater based on id");
	}
	
	ArrayList<Employee> al = new ArrayList<Employee>();
	
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	al.add(e5);
Collections.sort(al,new Demo1());
System.out.println(al);
}
}
