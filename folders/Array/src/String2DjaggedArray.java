import java.util.Scanner;

public class String2DjaggedArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name of class that are pesent in 1st Dimension");
	
	String arr[][] = new String[sc.nextInt()][];
	
	System.out.println();
	sc.nextLine();
	for(int i=0; i<= arr.length-1; i++) {
		System.out.println("The number of class in 1st dimension " + i + " number of Students " +i);
		arr[i] = new String[sc.nextInt()];
	}
	System.out.println();
	sc.nextLine();
	for(int i = 0; i <= arr.length-1; i++ ) {
		for(int j = 0; j<= arr[i].length-1; j++) {
			System.out.println("Enter the name of class " +i + " name of Student " +j);
			arr[i][j] = sc.nextLine();
		}
	}
	
	for(int i =0; i<= arr.length-1; i++) {
		System.out.print("[");
		for(int j = 0; j <= arr[i].length-1; j++) {
			System.out.print(arr[i][j]);
			
			if(j != arr[i].length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
}
