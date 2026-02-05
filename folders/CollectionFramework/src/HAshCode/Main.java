package HAshCode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashSet<Car> cars = new HashSet<Car>();
	
	int n = sc.nextInt();
	sc.nextLine();
	
	for(int i = 0; i < n; i++) {
		String model = sc.nextLine();
		int year = sc.nextInt();
		sc.nextLine();
		Car car = new Car(model,year);
		cars.add(car);
	}
	
	for(Car car : cars) {
		System.out.println(car);
	}
}
}

class Car {
	private String model;
	private int year;
	
	public Car(String model,int year) {
		this.model = model;
		this.year = year;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(model,year);
	}

	@Override
	public boolean equals(Object obj) {
		Car car = (Car)obj;
		return year == car.year && model.equals(car.model);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car { model = '" + model + "', year =" + year + "}";
	}
	
	
}
