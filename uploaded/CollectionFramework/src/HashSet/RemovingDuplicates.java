package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class RemovingDuplicates {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter count of Elemnts");
	
	int n = sc.nextInt();
	
	System.out.println("Enter Elements");
	HashSet<Integer> set = new HashSet<Integer>();
	for(int i = 0; i <= n-1; i++) {
		set.add(sc.nextInt());
	}
	System.out.println("Unique elements: "+ set);
}
}
