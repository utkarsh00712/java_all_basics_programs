package ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class StudentApp {
public static void main(String[] args) {
	Student s1 = new Student(1,"Utkarsh","male",88,5);
	Student s2 = new Student(2,"Harsh","male",85,4);
	Student s3 = new Student(3,"Raghav","male",90,7);
	Student s4 = new Student(5,"Sahil","male",95,8);
	Student s5 = new Student(7,"Anshul","male",78,4);
	ArrayList<Student>  al = new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
}
}
