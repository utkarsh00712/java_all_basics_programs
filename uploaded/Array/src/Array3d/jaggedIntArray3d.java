package Array3d;

import java.util.Scanner;

public class jaggedIntArray3d {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 1st D length that is number of Schools");
	
	int arr[][][] = new int[sc.nextInt()][][];
	
//	for input of 1st array;
//	arr[0] = new int[2][];
//	arr[1] = new int[3][];
//	arr[1] = new int[2][];
	for(int i = 0; i <= arr.length-1; i++) {
		
	System.out.println("Enter 2D length of 1st D array " + i + " that"
			+ " is number of class for school " +i);
	arr[i] = new int[sc.nextInt()][];
	}
	
	//for input of 2nd dimension array
//	arr[0][0] = new int[4];
//	arr[0][0] = new int[4];
//
//	arr[0][0] = new int[4];
//	arr[0][0] = new int[4];
//	arr[0][0] = new int[4];
//	
//	arr[0][0] = new int[4];
//	arr[0][0] = new int[4];
	// loop for 2nd Dimension Input
	
	for(int i =0; i <= arr.length-1; i++) {
		for(int j = 0; j <= arr[i].length-1; j++) {
			System.out.println("Enter the 3d length of Ist Dimension " + i +" i.e no of class of School " 
					+ " length of 3d array " + j + " i.e no of Students " +j);
			arr[i][j] = new int[sc.nextInt()];
		}
	}
	
	// input of 3rd dimension array
	for(int i = 0; i <= arr.length-1; i++) {
		for(int j = 0; j <= arr[i].length-1; j++) {
			for(int k = 0; k <= arr[i][j].length-1; k++) {
				System.out.println("Enter the number of schools " +i + " number of class " + j + " number of Students " +k);
			arr[i][j][k] = sc.nextInt();
			}
		}
	}
	
	for(int i = 0; i <= arr.length-1; i++) {
		System.out.print("{");
		for(int j = 0; j <= arr[i].length-1; j++) {
			System.out.print("[");
			for(int k = 0; k <= arr[i][j].length-1; k++) {
				System.out.print(arr[i][j][k]);
				
				if(k != arr[i][j].length-1) {
					System.out.print(" ,");
				}
			}
			System.out.println("]");
		} System.out.println("}");
		}
}
}
