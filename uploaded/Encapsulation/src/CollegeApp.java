
public class CollegeApp {
	public static void main(String[] args) {
		College A = new College(1,15,"Commerce");
		
		
		System.out.println("Departments: "+A.getDepartments() +" Barnches: "+ A.getBranches() +" Name: "+ A.getName());
		
		College copy = new College(A);
		copy.Departments = 3;
		System.out.println("  Department "+copy.Departments+ " Branch "+copy.Branches + " Name "+copy.Name);
		
		
	}

}
