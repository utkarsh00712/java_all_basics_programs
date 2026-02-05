package ArrayPractice;

import java.util.Scanner;

public class Maximumvaluein3Darray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int arr[][][] = new int[sc.nextInt()][sc.nextInt()][sc.nextInt()];
	
	// input for array
	for(int i = 0; i <= arr.length-1; i++) {
		for(int j =0; j <= arr[i].length-1; j++) {
			for(int k = 0; k <= arr[i][j].length-1; k++) {
				arr[i][j][k]=sc.nextInt();
			}
		}
	}
	
	for(int i = 0; i <= arr.length-1; i++) {
		System.out.println("layer " +(i+1));
		for(int j =0; j <= arr[i].length-1; j++) {
			for(int k = 0; k <= arr[i][j].length-1; k++) {
				System.out.print(arr[i][j][k] + " ");
			}
			System.out.println();
		}
	}
	
	int max = arr[0][0][0]; 
	for(int i = 0; i <= arr.length-1; i++) {
		for(int j = 0; j <= arr[i].length-1; j++) {
			
			for(int k = 0; k <= arr[i][j].length-1; k++) {
				if(arr[i][j][k] >max) {
					max = arr[i][j][k];
				}
		}
		} System.out.println("Maximum Value " +max);
	}
}
}
																			 