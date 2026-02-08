package ArrayPractice;

import java.util.Scanner;

public class AvareageOf3DArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int depth = sc.nextInt();
	int row = sc.nextInt();
	int column = sc.nextInt();
	
	int arr[][][] = new int[depth][row][column];
	
	for(int i = 0; i<depth; i++) {
		for(int j = 0; j <row; j++) {
			for(int k = 0; k < column; k++) {
				arr[i][j][k]= sc.nextInt();
			}
		}
	}
	
	for(int i = 0; i <= arr.length-1; i++) {
		System.out.println("Layer :" + (i+1));
		for(int j = 0; j <= arr[i].length-1; j++) {
			for(int k = 0; k <= arr[i][j].length-1; k++) {
				System.out.print(arr[i][j][k] + " ");
			}
			System.out.println();
		}
	}
	
	double avg = 0; 
	for(int j = 0; j < row; j ++) {
		for(int k = 0; k < column; k++ ) {
			int sum = 0; 
			for(int i = 0; i < depth; i ++) {
				sum = sum + arr[i][j][k];
			}
			avg = sum/arr.length;
			System.out.println("average of elemets in (" +j +","+ k + ") is " + avg);
		}
	}
	
	
}
}
