package ArrayPractice;

import java.util.Scanner;

public class TransposeofMatrix {
	public static void main(String[] args) {
		
	
Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int n = sc.nextInt();

int arr[][] = new int[m][n];

   for(int i = 0; i <= arr.length-1; i++) {
	   for(int j = 0; j <= arr[i].length-1; j++) {
		   arr[i][j] = sc.nextInt();
	}
   }
   
  int arr2[][] = new int[n][m];
  
  for(int i = 0; i <= arr.length-1; i++) {
	  for(int j = 0; j <= arr[i].length-1; j++) {
		  arr2[j][i]=arr[i][j];
	  }
  }
  
  System.out.println("Original matrix: ");
  for(int i = 0; i <= arr.length-1; i++) {
	  for(int j = 0; j <= arr[i].length-1; j++) {
		  System.out.print(arr[i][j] + " ");
	  }
	  System.out.println();
  }
  
  
  System.out.println("Transpose of matrix");
  for(int i = 0; i <= arr2.length-1; i++) {
	  for(int j = 0; j <= arr2[i].length-1; j++) {
		  System.out.print(arr2[i][j] + " ");
	  }
	  System.out.println();
  }
  
	}
}
