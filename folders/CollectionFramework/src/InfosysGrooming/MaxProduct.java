package InfosysGrooming;

import java.util.Scanner;

public class MaxProduct {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i = 0; i<= n-1; i++) {
		arr[i] = sc.nextInt();
	}
	
	System.out.println(maxProduct(arr));
}
public static int maxProduct(int arr[]) {
	
	int maxProd = Integer.MIN_VALUE;
	for(int i =0; i <= arr.length-1; i++) {
		int subProd = 1;
		for(int j = i; j <= arr.length-1; j++) {
	       subProd = subProd* arr[j];
	       if(subProd > maxProd) {
	    	   maxProd = subProd;
	    	   	       }
		}
	}
	return maxProd;
	
	
}
}
