package COmparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	for(int i = 0; i < n; i++) {
		numbers.add(sc.nextInt());
	}
	
	Collections.sort(numbers,new desc());
	
for(Integer x: numbers) {
	System.out.println(x);
}
}
}
