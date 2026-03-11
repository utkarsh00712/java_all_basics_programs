package practice;

import java.util.Scanner;

public class Palarr {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String s1 = sc.next();
	
	char arr1[] = s1.toCharArray();
	char arr2[] = new char[arr1.length];
	int j = arr2.length-1;
	
	for(int i= 0; i <= arr1.length-1; i++) {
		arr2[j] = arr1[i];
		j--;
	}
	String s2 = new String(arr2);
	
	if(s1.equals(s2)) {
		System.out.println("The String is palindrome");
	} else {
		System.out.println("The String is not a palindrome");
	}
}
}
