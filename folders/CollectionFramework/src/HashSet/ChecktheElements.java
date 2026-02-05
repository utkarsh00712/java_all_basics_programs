package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class ChecktheElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n1 = sc.nextInt();
	
	HashSet<Integer> hs1 = new HashSet<Integer>();
	
	for(int i = 0; i < n1; i++) {
		hs1.add(sc.nextInt());
	}
int n2 = sc.nextInt();
	
	HashSet<Integer> hs2 = new HashSet<Integer>();
	
	for(int i = 0; i < n2; i++) {
		hs2.add(sc.nextInt());
	}
	
	if(!hs1.equals(hs2)) {
		System.out.println("No");
	} else {
		System.out.println("YES");
	}
}
}
