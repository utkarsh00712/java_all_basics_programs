package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str1 = sc.nextLine();
	String str2 = sc.nextLine();
	
	str1 = str1.toLowerCase();
	str2 = str2.toLowerCase();
	
	char[] arr1 =str1.toCharArray();
   char[] arr2	= str2.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	Arrays.equals(arr1, arr2);
	
	System.out.println("The String is anagram " + Arrays.equals(arr1, arr2));
}
}
