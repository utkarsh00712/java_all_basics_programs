package Practice;

import java.util.Scanner;


public class Applicant {
int age;

void takeInput() {
	System.out.println("Enter Age: ");
	Scanner sc  = new Scanner(System.in);
	age = sc.nextInt();
}

void validate() throws LessAgeException, OverAgeException {
	if(age > 21 && age< 40) {
		System.out.println("Elegible");
	} else if(age>40) {
		OverAgeException oa = new OverAgeException();
	System.out.println(oa.getMessage());
		throw oa;
	} else {
		LessAgeException la = new LessAgeException();
		System.out.println(la.getMessage());
		throw la;
	}
}
}
