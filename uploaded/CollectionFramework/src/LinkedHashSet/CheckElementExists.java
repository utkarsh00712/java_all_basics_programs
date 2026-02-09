package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CheckElementExists {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	sc.nextLine();
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	
	for(int i = 0; i <n; i++) {
		lhs.add(sc.nextLine());
	}
	
   String str = sc.nextLine();
   if(lhs.contains(str)) {
	   System.out.println("Exists");
   } else {
	   System.out.println("Does not exists");
   }
}
}
