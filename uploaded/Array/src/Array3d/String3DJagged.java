package Array3d;

import java.util.Scanner;

public class String3DJagged {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ist Dimension input name of School");
	String arr[][][] = new String[sc.nextInt()][][];
	
	// 2nd dimension input
	
	for(int i = 0; i<= arr.length-1; i++) {
		System.out.println("Enter the 2nd D input taht is Number of classes " + i);
		arr[i] = new String[sc.nextInt()][];
	}
	
	// 3rd dimension input
	
	for(int i = 0; i <= arr.length-1; i++) {
		for(int j = 0; j <= arr[i].length-1; j++) {
			System.out.println("Enter the third Dimension input thai is number of class " +i
					+ " number of Students " + j);
			arr[i][j] = new String[sc.nextInt()];
		}
	}
	
	// input that to be Shown in jagged Array
	sc.nextLine();
	for(int i = 0; i <= arr.length-1; i++) {
		for(int j = 0; j <= arr[i].length-1; j++) {
			for(int k = 0; k <= arr[i][j].length-1; k++) {
		System.out.println("Enter the name of School " +i + " name of class " +j + "name of Student " +k);
				arr[i][j][k] = sc.nextLine();
			}
		}
	}
	
	// to print values 
	for(int i = 0; i <= arr.length-1; i++) {
		System.out.print("{ ");
		for(int j = 0; j <= arr[i].length-1; j++) {
			System.out.print("[ ");
			for(int k =0; k <= arr[i][j].length-1; k++) {
				System.out.print(arr[i][j][k]);
				if(k != arr[i][j].length-1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
		System.out.println("}");
	}
	
}
}
