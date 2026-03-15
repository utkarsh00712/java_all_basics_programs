package com.utkarsh.whil.create;
import java.util.Scanner;
public class fact2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int fact = 1;
	 int fact1 = 1;
 	int i = 1;
	 do {
		 fact*=i;
		 i++;
 } while(a>=i);
	 System.out.println(fact);

int j= 1;
do {
	 fact1*=j;
	 j++;
} while(b>=j);
   
System.out.println(fact1);
}
}
