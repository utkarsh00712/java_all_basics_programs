import java.util.Scanner;
public class TwoDimensionalIntArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the length of 1st diension and Second dimension Array");
	
	int arr[][] = new int[sc.nextInt()][sc.nextInt()];
	
	for(int i= 0; i<=arr.length-1; i++) {
		for(int j = 0; j <=arr[i].length-1; j++ ) {
			System.out.println("Enter the marks of Class " + i + " Student " + j);
			arr[i][j] = sc.nextInt();
		}
	}
	
	for(int i = 0; i <= arr.length-1; i++) {
		System.out.print("[");
		for(int j = 0; j<= arr[i].length-1; j++) {
			System.out.print(arr[i][j]);
			if(j !=arr[i].length-1) {
				System.out.print(" , "); 
				}
			
		}
		System.out.println("]");
	}
}
}
