package com.utk.num.manipulation;
import java.util.Scanner;
public class Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==1) {
			System.out.println(a + "is a prime number");
		}
		else {
			for(int i = 2; i <= a/2; i++) {
				if(a % i == 0) {
					System.out.println(a + " is not a prime number");
					return;
				}
			}
		}
		System.out.println(a + "is a prime number");
			}
		}
	


