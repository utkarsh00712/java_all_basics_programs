import java.nio.channels.AsynchronousSocketChannel;
import java.util.Scanner;

public class JaggedIntArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of class that are in 1st-D class");
	
	int arr[][] = new int[sc.nextInt()][];
	
//	arr[0] = new int[4];
//	arr[1] = new int[3];  HardCoded Input
//	arr[2] = new int[2];
//	arr[3] = new int[5];
	
	for(int i = 0; i <= arr.length-1; i++) {
		System.out.println("ENter the number of students for class " + i + " that is 2nd Dimension length of 1st dimension " +i);
		arr[i] = new int[sc.nextInt()];
	}
	System.out.println();
	
	for(int i = 0; i <= arr.length-1; i++) {
		for(int j = 0; j <= arr[i].length-1; j++) {
			System.out.println("Enter the marks of class " + i + " Student " + j);
			arr[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("Array Content Are....");
	for(int i = 0; i <= arr.length-1; i++) {
		System.out.print("[");
		for(int j = 0; j <= arr[i].length-1; j++) {
			System.out.print(arr[i][j]);
			if(j != arr[i].length-1) {
				System.out.print(" , ");
			}
		}
		System.out.println(" ]");
	}
}
}
