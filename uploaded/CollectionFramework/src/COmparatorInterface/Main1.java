package COmparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	ArrayList<String> al = new ArrayList<String>();
	
	for(int i = 0; i < n; i ++) {
		al.add(sc.next());
	}
	
	Collections.sort(al,new Ascending());
	
	for(String x: al) {
		System.out.println(x);
	}
} 
}
