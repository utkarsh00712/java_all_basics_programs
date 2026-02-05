import java.util.Scanner;
public class Circle extends Shape {

	int radius;
	
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter circle radius");
		radius = sc.nextInt();
		}

void calculateArea() {
	area = 3.14f*radius*radius;
	
	
}
}