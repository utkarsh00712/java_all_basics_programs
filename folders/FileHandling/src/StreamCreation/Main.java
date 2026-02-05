package StreamCreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
public static void main(String[] args) {
	try {
		String path1 = "C:\\InputOutput\\input.txt";
		String path2 = "C:\\InputOutput\\output.txt";
		
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			
			int data;
			
			
				while((data=fr.read()) != -1) {
				fw.write(data);
				}
				fr.close();
				fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}

