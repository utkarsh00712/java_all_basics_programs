package InfosysGrooming;

import java.util.ArrayList;
import java.util.Scanner;

public class MobileBatteryDrain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int b = sc.nextInt();
	int n = sc.nextInt();
	int [] c = new int[n];
	
	for(int i = 0; i <= c.length-1; i++) {
		c[i] = sc.nextInt();
	}
	
	System.out.println(minPowerMoves(b, c));
}

public static String minPowerMoves(int b, int[]c) {
	ArrayList<Integer> moves = new ArrayList();
	
	for(int i = 0; i <= c.length-1; i++) {
		moves.add(c[i]);
		moves.add(c[i]);
	}
	
	int sum = 0; 
	
	for(Integer x: moves) {
		sum+=x;
	}
	
	if(b >sum) {
		return "Cannot reach zero";
		
	} else {
		return "Possible";
	}
}
}
