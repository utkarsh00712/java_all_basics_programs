package Methodhiding;

public class ChemistryTeacher extends Teacher {

	String name;
	
	
	void markAttendence() {
		System.out.println(name + " chemistry teacher is marking attendence ");
	}
	
	
	void teach() {
		System.out.println(name + " chemistry teacher is teaching ");
		
	}
	public ChemistryTeacher(String name) {
		this.name = name;
	}
}
