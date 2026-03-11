package practice;

import java.util.Scanner;

public class ExtractDigits {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = new String(sc.nextLine());
	
	StringBuilder sb = new StringBuilder();
	
	for(int i = 0;  i <= str.length()-1; i++) {
 if(str.valueOf(str.charAt(i)).matches("\\d")) {
	 sb.append(str.charAt(i));
		}
	} System.out.println(sb);
}
}
