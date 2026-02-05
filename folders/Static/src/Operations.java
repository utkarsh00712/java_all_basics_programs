import java.util.Scanner;
public class Operations {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String operator = sc.next();
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	switch(operator) {
	case "Addition":
		System.out.println("addition " + calc.add(num1, num2) );
		break;
	case "Subtraction":
		System.out.println("subtraction " + calc.sub(num1, num2));
		break;
	case "Multiplication":
		System.out.println("multiplication " + calc.mul(num1, num2));
		break;
	case "Division":
		if(num2!=0) {
		System.out.println("division " + calc.div(num1, num2));  
		} else {
			System.out.println("invalid operand");
		}
		break;
		default:System.out.println("invalid operator");
	}
	
	
}
}

class calc{
	static int add(int a,int b) {
		return a+b;
		}
	static int sub(int a,int b) {
		return a-b;
		}
	static int mul(int a,int b) {
		return a*b;
		}
	static int div(int a,int b) {
		return a/b;
		}
}