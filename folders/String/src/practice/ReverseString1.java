package practice;

import java.util.Scanner;

public class ReverseString1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = "Hello World";
	 char arr1[] = str.toCharArray();
	 char arr2[] = new char[arr1.length];
	 
	 int j = arr2.length-1;
	 for(int i = 0; i <= arr1.length-1; i++) {
		 arr2[j] = arr1[i];
		 j--;
	 }
	 String str2 = new String(arr2);
	 System.out.println(str2);
}
}
