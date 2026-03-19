package com.utkarsh.cc.construction;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter marks");
		
		int a = scan.nextInt();
		int b = a/10;
		if (b >= 6)
		{
		System.out.println("Student Achieved " + "'*****'");
		}
		else if (b>=6)
		{
		System.out.println("Student Achieved " + "'****'");
		}
		else if (b >= 5)
		{
		System.out.println("Student Achieved " + "'***'");
		}
		else if (b >= 4)
		{
		System.out.println("Student Achieved " + "'**'");
		}
		else if (b >= 3)
		{
		System.out.println("Student Achieved " + "'*'");
		}
		else {
		System.out.println("You Failed exam " + " We wish you a better future");
		}
	}
}


