package com.utk.num.manipulation;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fab num = new fab();
		num.fibonacci(n);
		
	}

}
class fab{
	public void fibonacci(int n){
		int fib1=0;
		int fib2=1;
		if(n==1) {
			System.out.println(fib1);
		} else if(n==2) {
			System.out.println(fib2);
		}else {
			System.out.println(fib1);
			System.out.println(fib2);
			for(int i = 3; i<= n;i++) {
				int nextno = fib1 + fib2;
				System.out.println(nextno);
				fib1=fib2;
				fib2=nextno;
			}
			
		}
		
	}
	
}
