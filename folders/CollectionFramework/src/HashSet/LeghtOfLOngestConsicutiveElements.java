package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class LeghtOfLOngestConsicutiveElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	HashSet<Integer> hs = new HashSet<Integer>();
	for(int i = 0; i < n; i++) {
		hs.add(sc.nextInt());
	}

	int longest = 0;
	
	for(int num : hs) {
		if(!hs.contains(num-1)) {
			int currentNum = num;
			int length = 1;
		
		
		while(hs.contains(currentNum+1)) {
			currentNum++;
			length++;
		}
		longest = Math.max(longest, length);
	}
}
	System.out.println(longest);
}
}
