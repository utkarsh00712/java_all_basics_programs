
public class Student extends Person{
	int marks;
	String college;
	
	public Student() {
		super("Rahul",29);
		System.out.println("Student zero parameterized constructor Executed");
		marks = 35;
		college = "UCVE";
	}
	
	public Student(int marks) {
		this();
		System.out.println("Student single parameter constructor executed");
		this.marks = marks;
		college = "Kodnest";
	}
	
	public Student(int marks, String college) {
		this(95);
		System.out.println("Student two parameter Constructor executed");
		this.marks = marks;
		this.college = college;
	}
	
	
	

}
