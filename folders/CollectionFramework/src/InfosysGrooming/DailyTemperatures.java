package InfosysGrooming;

import java.util.Scanner;

public class DailyTemperatures {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int temperature[] = new int[sc.nextInt()];
	
	for(int i = 0; i <= temperature.length-1; i++) {
		temperature[i] = sc.nextInt();
	}
}
public static int[] temp(int[] temperature) {
	int n = temperature.length;
	int [] res = new int[n];

	for(int i = 0; i <= n-2; i++) {
		for(int j = i+1; j <= n-1; j++) {
		 if(temperature[j] > temperature[i]) {
			 res[i] = j-i;
			 break;
		 }
		}
	}
	return res;
}
}
