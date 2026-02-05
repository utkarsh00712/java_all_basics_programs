import java.util.Scanner;

public class UserInput1DArrayPrac {
public static void main(String[] args) {
	
	int marks[] = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the element");
	sc.nextInt();
	for(int i=0; i<= marks.length-1; i++) {
	System.out.println("Enter the number of elements"+i+ " in array");
		marks[i] = sc.nextInt();
	}
	System.out.print("[");
	for(int i = 0; i <= marks.length-1; i++) {
		System.out.print(marks[i]);
		if(i!=marks.length-1) {
			System.out.print(",");
		}
	}
	System.out.println("]");
}
}
