package com.utkarsh.cc.construction;
import java.util.Scanner;
public class Switch {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	switch(a){
	case 6,7,8,9,10->
		System.out.println("*****");
	case 5->
		System.out.println("****");
	case 4->
		System.out.println("***");
	case 3->
		System.out.println("**");
	default->
		System.out.println("Better luck next time");
	}
}
}
