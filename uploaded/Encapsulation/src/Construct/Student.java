package Construct;

public class Student {
private int id;
private String name;
private String gender;
private int marks;

public Student(int a, String b,String c,int d) {
	if(a>0) {
		id=a;
	}
	if(b.length() != 0) {
		name = b;
	}
	if(c.length() != 0) {
		gender = c;
	}
	if(d>0) {
		marks=d;
	}
}

public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getGender() {
	return gender;
}
public int getMarks() {
	return marks;
}
public String study() {
	return name +" is Studying java";
}
}
