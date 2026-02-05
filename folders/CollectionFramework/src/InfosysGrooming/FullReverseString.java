package InfosysGrooming;

import java.util.Scanner;

public class FullReverseString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	char[] arr = str.toCharArray();
	
	int i = 0;
	int j = arr.length-1;
	
	while(i < j) {
		if(arr[i]==' ') {
			i++;
		} else if(arr[j]==' ') {
			j--;
		} else {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	System.out.println("Reversed String: " + new String(arr));
}
}
