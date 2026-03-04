import java.util.Scanner;
public class Square extends Shape {
int length;

@Override
	void acceptInput() {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the length of square ");
	length = sc.nextInt();
		
	}

void calculateArea() {
	area = length*length;
	
}

}
