package Methodhiding;

public class PhysicsTeacher extends Teacher {

	String name;
	
	void markAttendence() {
		System.out.println(name + " physics teacher is marking attendence");
	}
	
	void teach() {
		System.out.println(name + "  physics teacher is teaching physics");
	}
	
	public PhysicsTeacher(String name) {
		this.name = name;
	}
}
