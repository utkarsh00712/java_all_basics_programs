package GraduationChechker;

import java.util.Scanner;

public class GraduationAgeChecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int studentAge = sc.nextInt();
	try {
		checkGraduationAge(studentAge);
		System.out.println("Congrats you are eligible to graduate");
		
	} catch(InvalidGraduationAgeChecker e) {
		System.out.println(e.getMessage());
	} finally {
		sc.close();
	}
	System.out.println("Program runs smoothly");
}

public static void checkGraduationAge(int age) throws InvalidGraduationAgeChecker {
	if(age<17) {
		throw new InvalidGraduationAgeChecker("Sorry, you are not eledgible to graduate");
		}
}
}
