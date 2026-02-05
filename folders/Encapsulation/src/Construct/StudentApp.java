package Construct;

public class StudentApp {
public static void main(String[] args) {
	
	Student s1 = new Student(1,"Rahul","Male",65);
	
	System.out.println("ID " +s1.getId());
	System.out.println("Name " +s1.getName());
	System.out.println("Gender " +s1.getGender());
	System.out.println("Marks " +s1.getMarks());
	System.out.println(s1.study());
}
}
