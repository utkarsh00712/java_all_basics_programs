package InfosysGrooming;

import java.util.Iterator;
import java.util.Scanner;

public class StringRemoveSpaces {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	String str = sc.nextLine();
	System.out.println(str);
	
	str = str.trim();
	System.out.println(str);
	
	String [] words = str.split("\\s+");
	
	StringBuffer sentence = new StringBuffer();
	for (String word : words) {
		sentence.append(word);
		sentence.append(" ");
	}
	System.out.println(new String(sentence).trim());
}
}
