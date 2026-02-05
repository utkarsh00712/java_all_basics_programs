package HAshCode;

import java.util.HashSet;

public class StudentApp {
public static void main(String[] args) {
	Student s1 = new Student();
	s1.name = "Utkarsh";
	s1.roll = 101;
	s1.introduce();
	
	Student s2 = new Student();
	s2.name = "Raghav";
	s2.roll = 102;
	s2.introduce();
	
	
	HashSet<Student> hs = new HashSet<Student>();
	hs.add(s1);
	hs.add(s2);
	System.out.println(hs);
}
}

