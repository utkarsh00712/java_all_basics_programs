package Methodhiding;

public class BiologyTeacher extends Teacher {

	String name;
	
	void markAttendence() {
		System.out.println(name + " Bio teacher is marking attendence");
	}
	
	void teach() {
		System.out.println(name + " Bio teacher is teaching Biology");
		
	}
	public BiologyTeacher(String name) {
		this.name = name;
	}
}
