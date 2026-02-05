package com.utk.num.manipulation;
import java.util.Scanner;
public class SumofNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		numbersum num = new numbersum();
		System.out.println(num.Sum(number));
	}

}
class numbersum {
	public int Sum(int number) {
		int sum = 0;
		while(number>0) {
			int digit = number%10;
			 number = number/10;
			 sum+=digit;
		}
		return sum;
		
	}
}
