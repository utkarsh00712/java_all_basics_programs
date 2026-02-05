import java.util.Scanner;
public class Rectangle extends Shape {
int length;
int breadth;

	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length and Breadth: ");
		length = sc.nextInt();
		breadth = sc.nextInt();
	}
 
	void calculateArea() {
		area = length*breadth;
		System.out.println("Area of rectangle " + area);
		
	}

}
