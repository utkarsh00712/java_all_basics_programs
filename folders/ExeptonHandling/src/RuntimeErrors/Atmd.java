package RuntimeErrors;

import java.util.Scanner;

public class Atmd {
	int username;
	int passWord;

	public  void validate() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection to Database Established");
		try {
		System.out.println("Enter Username and Password");
		
		username = sc.nextInt();
		passWord = sc.nextInt();
		int res = username/passWord;
		
		System.out.println("Validate take money");
		} 
		
		finally {
		System.out.println("Connection to Database Terminated");
		}
	}

}
