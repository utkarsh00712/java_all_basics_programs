package InfosysGrooming;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSupplies {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<String> list = new ArrayList();
	
	int n = sc.nextInt();
	
	for(int i = 0; i<= n-1; i++) {
		list.add(sc.next());
	}
	
	int m = sc.nextInt();
	
	for(int i = 0; i <= m-1; i++) {
	  list.remove(sc.next());
	}
	
	for(int i = 0; i <= list.size()-1; i++) {
		System.out.print(list.get(i));
		if(i != list.size()-1) {
			System.out.print(",");
		}
	}
	
}
}
