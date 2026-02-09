package HashSet;

import java.util.HashSet;
import java.util.Scanner;



public class InterSection {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n1 = sc.nextInt();
	
	HashSet<Integer> hs1 = new HashSet<Integer>();
	for(int i = 0; i < n1; i++) {
		hs1.add(sc.nextInt());
	}
	
	int n2 = sc.nextInt();
	
	HashSet<Integer> hs2 = new HashSet<Integer>();
	for(int i = 0; i <n2; i++) {
		hs2.add(sc.nextInt());
	}
	
   hs1.retainAll(hs2);
	if(hs1.isEmpty()) {
		System.out.println("NO COMMON ELEMENTS");
		} 
		else  {
			for(Integer x: hs1) {
				System.out.println(x+" ");
			}
	} 
}
}
