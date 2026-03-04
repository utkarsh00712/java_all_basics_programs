
public class PhysicsTeacher extends Teacher{

	public PhysicsTeacher(String name) {
		this.name = name;
		}
	

	void markAttendence() {
		System.out.println(name+ " Physics teacher is  attendence");
	}
	

	void teach() {
		System.out.println(name+ " Physic teacher is teaching physics");
	}
}
