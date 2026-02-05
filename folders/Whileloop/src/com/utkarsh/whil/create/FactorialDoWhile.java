package com.utkarsh.whil.create;
import java.util.Scanner;
public class FactorialDoWhile {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int m = sc.nextInt();
	 int n = sc.nextInt();
	 
	 int fact1 = 1;
	 int fact2 = 1;
	 int i = 1;
	 if (m<0) {
		 System.out.println("invalid option");
	 } else {
	 do {
		 fact1*=i;
		 i++;
		 
	 } while(i<=m);
	 System.out.println("factorial of number "+ m +" is"+ fact1);
	 
	 
	 if (n<0) {
		 System.out.println("invalid option");
	 }else {
		 int j =1;
		 do {
			 fact2 *= j;
			 j++;
		 } while(j<=n);
	 }
	 System.out.println("factorial of number "+ n +" is"+ fact2);
}
}
}
