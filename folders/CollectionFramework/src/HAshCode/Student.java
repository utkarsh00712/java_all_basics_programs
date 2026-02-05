package HAshCode;

import java.util.Objects;

public class Student {
int roll;
String name;

void introduce() {
	System.out.println("Student Name is " + name + " roll no " + roll);
	
}
@Override
public boolean equals(Object obj) {
	if(this==obj) {
		return true;
	}
	if(obj==null||getClass()!=obj.getClass()) {
		return false;
	}
	Student s = (Student) obj;
	return roll == s.roll && name.equals(s.name);
}
@Override
public int hashCode() {
	return Objects.hash(roll,name);
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return roll +" " + name;
}


}
