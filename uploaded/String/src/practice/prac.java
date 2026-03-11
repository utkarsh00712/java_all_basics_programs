package practice;

import java.util.Scanner;

public class prac {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer();
	for(int i = 1; i <= 3; i++) {
		String s = sc.nextLine();
		sb.append(s);
	}
	System.out.println("The concatinated String is " + sb);
	System.out.println(sb.toString().toUpperCase());
}
}
