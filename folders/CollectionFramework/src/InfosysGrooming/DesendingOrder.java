package InfosysGrooming;

import java.util.Scanner;

public class DesendingOrder {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	
	int arr[] = new int[sc.nextInt()];
	for(int i = 0; i <= arr.length-1; i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(minValue(arr));
}
public static int minValue(int arr[]) {
	int res = 0;
	for(int i=0; i <= arr.length-2; i++) {
		if(arr[i+1] > arr[i]) {
			res=res+arr[i+1]-arr[i];
			arr[i+1]=arr[i];
		}
	}
	return res;
}
}
