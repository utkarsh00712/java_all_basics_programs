package FileMethods;

import java.io.File;
import java.io.IOException;

public class Demo {
public static void main(String[] args) throws IOException {
	
	String path = "C:\\Kodnest\\StudentPercentage.txt";
	File file = new File(path);
	
	System.out.println("File path: " + file.getPath());
	System.out.println("File Absolute path: " +  file.getAbsolutePath());
	System.out.println("File canonical Path: " +  file.getCanonicalPath());
	System.out.println( "File Name: "+  file.getName());
	System.out.println("Doe file exists? "+ file.exists());
	System.out.println("Is path a File? " + file.isFile() );
	System.out.println("Is path a Folder? " +file.isDirectory());
	System.out.println( "Does file have a write permission? "+ file.canWrite());
	System.out.println("Does file have a read permission? " +file.canRead());
	System.out.println("Does file have a execute permission? "+file.canExecute());
	
	
}
}
