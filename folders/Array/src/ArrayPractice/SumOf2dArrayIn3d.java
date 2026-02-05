package ArrayPractice;

import java.util.Scanner;

public class SumOf2dArrayIn3d {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int arr[][][] = new int[sc.nextInt()][sc.nextInt()][sc.nextInt()]; 
	
	for(int i = 0; i <= arr.length-1; i++) {
		for(int j = 0; j <= arr[i].length-1; j++) {
			for(int k = 0; k <= arr[i][j].length-1; k++) {
				arr[i][j][k] = sc.nextInt();
			}
		}
	}
	
	for(int i = 0; i <= arr.length-1; i++) {
		for(int j = 0; j <= arr[i].length-1; j++) {
			for(int k = 0; k <= arr[i][j].length-1; k++) {
				System.out.print(arr[i][j][k] +" ");
			}
			System.out.println();
		}
	}
	
	for(int i = 0; i <= arr.length-1; i++) {
		int sum = 0;
		for(int j = 0; j <= arr[i].length-1; j++) {
			for(int k = 0; k <= arr[i][j].length-1; k++) {
				
				sum = sum + arr[i][j][k];
				
			}
		}
		System.out.println("Sum of 2d array "+(i+1) +" is" + sum );
	}
}
}

