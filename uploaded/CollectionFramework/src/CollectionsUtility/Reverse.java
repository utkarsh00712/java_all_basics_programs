package CollectionsUtility;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<String> al = new ArrayList<String>();
	
	for(int i = 0; i < 5; i++) {
		al.add(sc.next());
	}
	
	for(int i = 0; i <= al.size()-1;i++) {
		System.out.print(al.get(i));
		if(i!=al.size()-1) {
			System.out.print(",");
		}
	}
}
}
