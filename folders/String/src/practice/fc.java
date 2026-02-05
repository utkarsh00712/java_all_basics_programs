package practice;

import java.util.Scanner;

public class fc {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	boolean visited[] = new boolean[str.length()];
	
	for(int i = 0; i <= str.length()-1; i++) {
		if (visited[i]) {
			continue;
		}
		int count = 0;
		for(int j = 0; j <= str.length()-1; j++) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
				visited[j] = true;
			}
		} System.out.println(String.valueOf(str.charAt(i)) + " " +count);
		}
}
}
