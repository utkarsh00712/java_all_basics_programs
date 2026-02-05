package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingatFirstIndex {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	ArrayList<Integer> al = new ArrayList();
	
	for(int i = 0; i <n ;i ++ ) {
		al.add(sc.nextInt());
	}
	
	System.out.println("Original ArrayList");
	for(Integer x: al) {
		System.out.print(x +" ");
	}
	al.addFirst(sc.nextInt());
	
	System.out.println("Updated ArrayList: ");
	for(Integer x : al) {
		System.out.print(x +" ");
	}
	
}
}
