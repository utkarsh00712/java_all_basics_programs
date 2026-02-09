package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Difference {
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
		
		HashSet<Integer> difference = new HashSet<Integer>(hs1);
		difference.removeAll(hs2);
		
		
		if(hs1.contains(difference)) {
		for(int x: difference) {
			if(difference.contains(x)) {
			System.out.print(x+" ");
			}
		}
		
		} else {
			System.out.println("No Difference");
		}
		
	} 
}
