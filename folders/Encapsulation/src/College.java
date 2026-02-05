
public class College {
int Departments;
int Branches;
String Name;


public College(int Departments, int Branches, String Name) {
	this.Departments = Departments;
	this.Branches = Branches;
    this.Name = Name;
	}

public College(College copy) {
	this.Departments = copy.Departments;
	this.Branches = copy.Branches;
	this.Name = copy.Name;
}
public int getDepartments() {
	return Departments;
}
public void setDepartments(int Departments) {
	this.Departments = Departments;
}

public int getBranches() {
	return Branches;
}

public void setBranches(int branches) {
	this.Branches = branches;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	this.Name = name;
}
public void display() {
	System.out.println("Department  " + Departments +"  Branch : " + Branches +"  Name: " +Name);
	
	}
}
