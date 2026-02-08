import java.util.Scanner;
public class ArrayExample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int arr[] = new int[sc.nextInt()];
	
	for(int i=0; i<=arr.length-1; i++) {
		System.out.println("Enter the marks of student " + i);
		 arr[i] = sc.nextInt();
	}
	
	System.out.println("Array Elements");
	System.out.print("[");
	for(int i=0; i<=arr.length-1; i++) {
		System.out.print(arr[i]);
		if(i != arr.length-1) {
			System.out.print(", ");
		}
	}
	System.out.print("]");
}
}
