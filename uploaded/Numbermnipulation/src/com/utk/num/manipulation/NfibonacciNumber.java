package com.utk.num.manipulation;
import java.util.Scanner;
public class NfibonacciNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibonacci num = new fibonacci();
		int res = num.nthnumber(n);
		System.out.println(res);
		
	} 
	}
class fibonacci{
	public int nthnumber(int n) {
		int a = 0;
		int b = 1;

		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}else {
			int las=0;
			
			for(int i= 2;i<=n;i++) {
				las=a+b;
				a=b;
				b=las;
			}
			return las;
		}
		
	}
}
