package practice;

import java.util.Scanner;

public class Split {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String s = sc.nextLine();
	String [] s1 = s.split(" ");
	System.out.println("Split words: ");
	for(String x : s1) {
		System.out.println(x);
	}
	
	char delimeter = sc.next().charAt(0);
	String str = String.join(String.valueOf(delimeter),s1);
	System.out.println("Joined Sentence: " + str);
}
}
