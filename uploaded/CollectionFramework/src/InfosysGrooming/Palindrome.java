package InfosysGrooming;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Word");
	String words = sc.nextLine();
	
	ArrayDeque<Character> dq = new ArrayDeque<Character>();
	
	for(char c : words.toCharArray()) {
		dq.addLast(c);
	}
	
	boolean isPalindrome = true;
	
	while(dq.size() > 1) {
		if(!dq.removeFirst().equals(dq.removeLast())) {
			isPalindrome = false;
			break;
		}
	}
	System.out.println(words +" "+ (isPalindrome ? "is palindrome " : "is not a palindrome") );
	
}
}
