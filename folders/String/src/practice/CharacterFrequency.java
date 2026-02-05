package practice;

import java.util.Scanner;

public class CharacterFrequency {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	String str = sc.nextLine();
	StringBuilder sb = new StringBuilder();
	
	for(int i = 0; i<= str.length()-1; i++) {
		int count = 0;
		for(int j = str.length()-1; j >=0; j--) {
			if(str.charAt(i) == str.charAt(j)) {
				count++;
				
			}
		}
		if(sb.indexOf(String.valueOf(str.charAt(i))) != -1) {
			continue;
		}
		sb.append(str.charAt(i));
		System.out.println( str.charAt(i) + ": " + count);
	}
}
}
