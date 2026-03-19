package com.utkarsh.cc.construction;
import java.util.Scanner;
public class Char {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 
	String input = scan.next();
	System.out.println(Char.printChar(input));
	
}
public static char printChar(String a) {
	char b= a.charAt(0);
	return b ;
	
}

}
