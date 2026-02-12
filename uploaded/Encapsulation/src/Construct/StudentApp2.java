package Construct;

public class StudentApp2 {
public static void main(String[] args) {
	
	Student s2 = new Student(2,"Rahu","Male",66);
	
	System.out.println("ID " +s2.getId());
	System.out.println("Name " +s2.getName());
	System.out.println("Gender " +s2.getGender());
	System.out.println("Marks " +s2.getMarks());
	System.out.println(s2.study());
}	

}
