package StreamCreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
public static void main(String[] args) {
	
	try {
	String path1 = "C:\\InputOutput\\input.txt";
	String path2 = "C:\\InputOutput\\output.txt";
	
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos = new FileOutputStream(path2);
		
		int data;
		int sum = 0;
		try {
			while((data=fis.read()) != -1) {
			sum = sum +	fis.read();
			  fos.write(sum);
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
}
}
