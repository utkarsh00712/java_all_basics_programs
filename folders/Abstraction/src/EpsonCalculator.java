import java.util.Scanner;
public class EpsonCalculator implements Calculate{
Scanner sc = new Scanner(System.in);
	

	public void add() {
		System.out.println("Enter two numbers to addi: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("The addition of two numbers: " + c);
		
	}

	@Override
	public void sub() {
		System.out.println("Enter two numbers to subtract: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a - b;
		System.out.println("The Subtraction of two numbers: " + c);
		
	}

	@Override
	public void mul() {
		System.out.println("Enter two numbers to multiply: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		System.out.println("The multiplication of two numbers: " + c);
		
	}

	@Override
	public void div() {
		System.out.println("Enter two numbers to divide: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b>0) {
		int c = a / b;
		System.out.println("The division of two numbers: " + c);
		} else {
			System.out.println("invalid input");
		}
		
	}

}
