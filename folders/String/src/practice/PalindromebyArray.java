package practice;

import java.util.Scanner;

public class PalindromebyArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	
	String str = sc.next();
	
	char arr1[] = str.toCharArray();
	char arr2[] = new char[arr1.length];
	int j = arr2.length-1;
	
	for(int i = 0; i <= arr1.length-1; i++) {
	arr2[j]	= arr1[i];
	j--;
	}
	
    String str2 = new String(arr2); 
	if(str.equals(str2)) {
		System.out.println("String is palindrome");
	} else {
		System.out.println("String is not a palindrome");
	}
}
}
