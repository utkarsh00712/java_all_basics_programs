package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Implementation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	sc.nextLine();
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	
	for(int i = 0; i < n; i++) {
		lhs.add(sc.next());
	}
	
	System.out.println(lhs.size());
	System.out.println(lhs); 

}
}
