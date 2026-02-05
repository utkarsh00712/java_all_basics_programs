package com.utk.num.manipulation;
import java.util.Scanner;

public class Primeinterval {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
int start = sc.nextInt();
int end = sc.nextInt();
System.out.println("prime numbers between " +start + " and " + end + " are "  );
for(int i = start; i<= end;i++) {
	number num = new number();
	boolean res = num.printPrime(i);
	if (res == true) {
		System.out.println(i);
	}
}


}
}
class number{
	public boolean printPrime(int n) {
		
		if (n==1) {
			return false;
		} else {
			for(int i = 2; i<= n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
		
		}
	}
