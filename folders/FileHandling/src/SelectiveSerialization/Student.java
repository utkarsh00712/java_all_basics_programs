package SelectiveSerialization;

import java.io.Serializable;

public class Student implements Serializable {
int id;
String name;
transient int marks;
String gender;
transient int age;
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
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Student(int id, String name, int marks, String gender, int age) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
	this.gender = gender;
	this.age = age;
}
@Override
public String toString() {
	return "id=" + id + ", name=" + name + ", marks=" + marks + ", gender=" + gender + ", age=" + age ;
}


}
