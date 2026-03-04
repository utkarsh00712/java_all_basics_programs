
public class TeacherApp {
public static void main(String[] args) {
	/*PhysicsTeacher P = new PhysicsTeacher("Raghav");
	P.markAttendence();
	P.teach();
	
	ChemistryTeacher C = new ChemistryTeacher("Utkarsh");
	C.markAttendence(); // Polymorphism can be allowed in loose coupling
	C.teach();
	*/
	
	/*PhysicsTeacher P = new PhysicsTeacher("Raghav");
	Teacher ref;
	ref = P;
	ref.markAttendence();
	ref.teach();
	
	ChemistryTeacher C = new ChemistryTeacher("Utkarsh");
	ref = C;   ** this is a type of polymorphism **
	ref.markAttendence();
	ref.teach();*/
	
/*	College college = new College();
	PhysicsTeacher pt = new PhysicsTeacher("Raghav");
	college.accept(pt);
	
	ChemistryTeacher ct = new ChemistryTeacher("Utkarsh");
	college.accept(ct);
	
	BiologyTeacher Bt = new BiologyTeacher("Vivek");
	college.accept(Bt);*/
	
	// Anonymous Object
	College.accept(new PhysicsTeacher("Ramya"));
	College.accept(new ChemistryTeacher("Soumya"));
}
}
