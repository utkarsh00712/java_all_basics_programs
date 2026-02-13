package Practice;

import java.util.Scanner;

public class ATM {
int un = 1111;
int pwd = 2222;

int eun;
int epwd;
void takeInput() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Username and Password");
	eun = sc.nextInt();
	epwd = sc.nextInt();
	
}

void validate() throws InvaildUsernameOrPasswordEcxeption  {
	
	if(un==eun&& pwd == epwd) {
		System.out.println("COngrats.... Take your manoey");
	} else {
		InvaildUsernameOrPasswordEcxeption uae = new InvaildUsernameOrPasswordEcxeption();
		System.out.println(uae.getMessage());
		throw uae;
	}
}
}
