package InfosysGrooming;

import java.util.Scanner;

public class DifferentAdjacentCharacter {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	
	System.out.println(s);
	
}
public static String reorganizeString(String s) {
	
	for(int i = 0; i <= s.length()-1; i++) {
		for(int j = 0; j <= s.length()-1; j++) {
			char c = s.charAt(j);
			
			if(s.charAt(i)== s.charAt(j)) {
				
			}
		}
	}
	return "";
}
}
