import java.util.Scanner;
public class Celcius {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String Type = sc.nextLine();
	double value = sc.nextDouble();
	switch(Type) {
	case("Celcius"):
		System.out.println(fahrenheit.convertf(value));
	break;
	case("Faherenheit"):
		
	System.out.println(fahrenheit.convert(value));
	}
	
}
}


class fahrenheit{
	public static double convert(double value) {
		return  (value*1.8+32);
	}
	public static double convertf(double value) {
		return  ((value-32)/1.8);
	}
	
}