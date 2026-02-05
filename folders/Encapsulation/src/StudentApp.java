
public class StudentApp {
public static void main(String[] args) {
	
	Student a = new Student();
	
	a.setid(12345);
	System.out.println("The id of a student is " + a.getid());
	a.setname("Rohan");
	System.out.println("The name of student is " + a.getname());
	a.setmarks(50);
	System.out.println("student got " + a.getmarks() +"marks in exam.");
}
}
