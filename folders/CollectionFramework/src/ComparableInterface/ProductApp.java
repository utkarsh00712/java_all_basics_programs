package ComparableInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Product> al = new ArrayList<Product>();
		
		for(int i = 0; i < n; i++) {
			String name = sc.next();
			double price = sc.nextDouble();
			sc.nextLine();
			al.add(new Product(name, price));
		}
		
		for(Product product : al) {
			System.out.println(product);
		}
	}
}
