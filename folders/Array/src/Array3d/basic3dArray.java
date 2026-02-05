package Array3d;

import java.util.Scanner;

public class basic3dArray {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int arr[][][] = new int[sc.nextInt()][sc.nextInt()][sc.nextInt()];
	
	for(int i = 0; i<= arr.length-1; i++) {
		for(int j = 0; j <= arr[i].length-1; j++) {
			for(int k =0; k <= arr[i][j].length-1; k++) {
	     System.out.println("Enter the values of ist array " + i + " Second Array " +j + "Third array " +k);
				arr[i][j][k] = sc.nextInt();
			}
		}
	}
	
	for(int i =0; i <= arr.length-1; i++) {
		System.out.println("{ ");
		for(int j = 0; j <= arr[i].length-1; j++) {
			System.out.print("[");
			for(int k = 0; k <= arr[i][j].length-1; k++) {
				System.out.print(arr[i][j][k]);
				if(k != arr[i][j].length-1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		} System.out.println("}");
	}
}
}
