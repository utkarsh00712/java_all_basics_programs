
public class ChemistryTeacher extends Teacher {

	public ChemistryTeacher(String name) {
		this.name = name;
	}
 
	void markAttendence() {
		System.out.println(name+ " chemisrty teacher is taking attendence");
	}
	

	void teach() {
		System.out.println(name+ " chemistry teacher is teaching chemistry");
	}
	
}
