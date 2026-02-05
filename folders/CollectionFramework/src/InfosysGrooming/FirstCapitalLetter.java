package InfosysGrooming;

import java.util.Scanner;

public class FirstCapitalLetter {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	
	str = str.toLowerCase();
	
	String[] words = str.split("\\s");
	StringBuffer sb = new StringBuffer();
	for(String word: words) {
		sb.append(Character.toUpperCase(word.charAt(0)));
		sb.append(word.substring(1));
		sb.append(" ");
	}
	System.out.println(new String(sb).trim());
}
}
