package InfosysGrooming;

import java.util.Scanner;

public class ReplaceVowel {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	str = str.toLowerCase();
	
	StringBuilder sb = new StringBuilder();
	
	for(int i=0 ; i <= str.length()-1; i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			sb.append("*");
		} else {
			sb.append(str.charAt(i));
		}
	}
	System.out.println(sb.toString());
}
}
