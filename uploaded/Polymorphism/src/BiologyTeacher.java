
public class BiologyTeacher extends Teacher {

	public BiologyTeacher(String name) {
		this.name = name;
	}
	
	void markAttendence() {
		System.out.println(name + "Bio teaxher is taking attendence");
		
	}
	
	void teach() {
		System.out.println(name + "Bio teacher is teaching bio");
	}
}
