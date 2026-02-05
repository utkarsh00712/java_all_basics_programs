package practice;

import java.util.Scanner;

public class LongestSubstring {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	
	int maxlength = 0; 
	for(int i =0; i <= str.length()-1; i++) {
		String sub = "";
		for(int j =0; j <= str.length()-1; j++) {
			
			char c= str.charAt(j);
			
			if(sub.indexOf(c) != -1) {
				break;
			} 
				sub = sub + c;
				maxlength = Math.max(maxlength, sub.length());
			
		
		}
	} System.out.println(maxlength);
}
}
