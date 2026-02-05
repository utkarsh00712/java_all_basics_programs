package InfosysGrooming;

import java.util.Scanner;

public class LongestSubstringWithoutRepeating {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	
	int maxLength= 0; 
	for(int i = 0; i <= str.length()-1; i++) {
		String maxString = "";
		for(int j = 0; j <= str.length()-1; j++) {
			char c = str.charAt(j);
			
			if(maxString.indexOf(c) != -1) {
				break; 
			} else {
				maxString = maxString + c;
				if(maxString.length() > maxLength) {
					maxLength = maxString.length();
				}
			}
			}
		System.out.println("the longest substring: " + maxString);
		break;
		}
	System.out.println("The length of longest String without repeating character is: " + maxLength );
	}
}

