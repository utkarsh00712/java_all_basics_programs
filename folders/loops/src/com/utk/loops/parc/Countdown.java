package com.utk.loops.parc;
import java.util.Scanner;
public class Countdown {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int N = sc.nextInt();
	while(N>0) {
		System.out.println("Countdown: "+N);
		N--;
	} System.out.println("Blast Off");
}
}
