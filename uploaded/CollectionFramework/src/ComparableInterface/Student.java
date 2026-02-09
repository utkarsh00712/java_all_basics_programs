package ComparableInterface;

public class Student implements Comparable<Student>{
 private int id;
 private String name;
 private String gender;
 private int marks;
 private int sem;
public Student(int id, String name, String gender, int marks, int sem) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.marks = marks;
	this.sem = sem;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getSem() {
	return sem;
}
public void setSem(int sem) {
	this.sem = sem;
}
 
 @Override
	public String toString() {
		
		return id +" " + name +" " + gender +" " + marks +" " + sem;
	}

@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	if(this.name.equals(o.name)) {
		return 0;
	} else {
	return this.name.compareTo(o.name);
	}
}
}
