package com.utk.num.manipulation;
import java.util.Scanner;
public class PositiveNumber {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
    Number num = new Number();  
      num.positive(n); 
	}
         }
class Number {
	public int positive(int n) {
		if(n >0) {
			System.out.println("number " + n + " is a positive number");
		}
		else if(n<0) {
			System.out.println("number " + n + " is a negative number");
		} else {
			System.out.println("number " + n + " is zero" );
		}
		return n;
		
	}
}
    
    


	



		

	


