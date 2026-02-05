import java.util.Scanner;
public class StudentHeight {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the length of array");
	double arr[] = new double[ (int) sc.nextDouble()];
	
	for(int i = 0; i <= arr.length-1; i++) {
		System.out.println("Enter the height of Student " + i);
		arr[i] = sc.nextDouble();
	}
	System.out.println("The height of Students are");
	System.out.print("[");
	for(int i=0; i <= arr.length-1; i++) {
		System.out.print(arr[i]);
		if(i != arr.length-1) {
			System.out.print(", ");
		}
	}
	System.out.println("]");
	
}
}
