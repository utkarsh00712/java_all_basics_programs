package SelectiveSerialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DesiralizationApp {
public static void main(String[] args) {
	try {
		Student student = new Student(123, "utkarsh", 85, "Male", 21);
		String path = "C:\\Kodnest\\Student.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
	    Student stu	=(Student)ois.readObject();
	    System.out.println(stu);
		
	} catch(Exception e) {
		e.printStackTrace();
	}
}
}

