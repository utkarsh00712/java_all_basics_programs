package InfosysGrooming;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	
String [] str1 = str.split("\\s");
StringBuilder sb = new StringBuilder();

for(int i = str1.length-1; i >= 0; i--) {
	sb.append(str1[i]).append(" ");

}
System.out.println(sb);
}
}
