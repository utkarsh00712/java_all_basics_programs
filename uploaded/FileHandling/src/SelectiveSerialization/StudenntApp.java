package SelectiveSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class StudenntApp {
public static void main(String[] args) {
	try {
		Student student = new Student(123, "utkarsh", 85, "Male", 21);
		String path = "C:\\Kodnest\\Student.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student);
		
		fos.close();
		oos.close();
		
	} catch(Exception e) {
		e.printStackTrace();
	}
}
}
