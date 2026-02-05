package StreamCreation;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentDetails {
public static void main(String[] args) throws IOException {
	Scanner sc =null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	try {
	String path = "C:\\Kodnest\\StudentPercentage.txt";
	 sc = new Scanner(System.in);
	
	String subject []  = {"Kannda", "English", "Hindi", "Math", "Science", "Social"};
	int totalSum = 0;
	
	 fw = new FileWriter(path);
	 bw = new BufferedWriter(fw);
	
	for(int i = 0; i <= subject.length-1; i++) {
		int marks = sc.nextInt();
		bw.write(subject[i] +": " + marks +"\n");
		totalSum += marks;
	}
	
	double percentage = totalSum / 6.0;
	bw.write("Total marks: " + totalSum +"\n");
	bw.write("Total percantage: " + percentage + "\n");
	} finally {
		sc.close();
		bw.close();
		fw.close();
	}
}
}
