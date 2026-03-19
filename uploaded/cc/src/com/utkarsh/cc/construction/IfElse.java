package com.utkarsh.cc.construction;
import java.util.Scanner;
public class IfElse {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter age ");
	int age = sc.nextInt();
	
	 if  (age>=18) 
	    {
		System.out.println("The person is adult");
		
	}
	else if(age<18)  {
		System.out.println("he can  not vote on election");
		System.out.println("he can discuss about party");
		
	}
		

	}

}
