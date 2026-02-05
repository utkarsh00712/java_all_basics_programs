package ArrayPractice;

import java.util.Scanner;

public class TwoDimensionMinimumSum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int arr[][] = new int[sc.nextInt()][sc.nextInt()];
	
	for(int i = 0; i<= arr.length-1; i++) {
		for(int j = 0; j <= arr[i].length-1; j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	
	for(int i = 0; i<= arr.length-1; i++) {
		for(int j = 0; j <= arr[i].length-1; j++) {
			System.out.print(arr[i][j] +" "); 
			
		}
		System.out.println();
	}
	
	int finalsum = 0;
	for(int i = 0; i<= arr.length-1; i++) {
		int rowmin = arr[i][0]; 
		for(int j = 1; j <= arr[i].length-1; j++) {
			if(arr[i][j] < rowmin) {
				 rowmin = arr[i][j] ;
			}
			
		}
		
		finalsum = finalsum + rowmin;
	
		
		System.out.println("minimum value: " + rowmin);
	}
System.out.println("final value: " + finalsum);
		
}
}
