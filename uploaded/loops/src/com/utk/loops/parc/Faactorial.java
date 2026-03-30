package com.utk.loops.parc;
import java.util.Scanner;
public class Faactorial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int factorial = 1;
	while(N>=1) {
		factorial *= N ;
				N--;
		
	}
	System.out.println("Factorial  " + factorial);
}
}
