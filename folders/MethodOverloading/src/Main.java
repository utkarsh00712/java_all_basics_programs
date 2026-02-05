
public class Main {
public static void main(String[] args) {
	
	PhysicsTeacher pt = new PhysicsTeacher();
	ChemistryTeacher ct = new ChemistryTeacher();
	BioTeacher bt = new BioTeacher();
	
	pt.name = "Physics Teacher";
	ct.name = "Chemistry Teacher";
	bt.name = "Biology Teacher";
	
	pt.markAttendence();
	pt.teach();
	pt.doLawsExp();
	
	ct.markAttendence();
	ct.teach();
	ct.doChemicalExp();
	
	bt.markAttendence();
	bt.teach();
	bt.doDisectionExp();
	
}
}
