package Treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class Demo1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	sc.nextLine();
	
	TreeSet<String> ts = new TreeSet<String>();
	
	for(int i = 1; i <= n; i++) {
		String strArr[] = sc.nextLine().split(" ");
		
		switch(strArr[0]) {
		case "ADD" :
			ts.add(strArr[1]);
			break;
			
		case "REMOVE" :
			ts.remove(strArr[1]);
			break;
			
		case "CHECK" :
			if(ts.contains(strArr[1])) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			break;
			
		case "FIRST" :
			if(ts.isEmpty()) {
				System.out.println("No Language");
			} else {
				System.out.println(ts.first());
			}
		break;
		
		case "LAST" :
			if(ts.isEmpty()) {
				System.out.println("No Language");
			} else {
				System.out.println(ts.last());
			}
		break;
		
		case "Print" :
			if(ts.isEmpty()) {
				System.out.println("No Language");
			} else {
				System.out.println(ts);
			}
			
		}
		
	}
}
}
