package InfosysGrooming;

import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String s = sc.nextLine();
	
	for(int i = 0; i <= s.length()-1; i++) {
		System.out.println(s.substring(0,i));
	}
}
}
