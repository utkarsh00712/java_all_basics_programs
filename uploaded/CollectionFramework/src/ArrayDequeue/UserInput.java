package ArrayDequeue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter n");
	int n = sc.nextInt();
	
  ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
  
  for(int i = 0; i <n; i++) {
	  ad.add(sc.nextInt());
  }
  
  System.out.println(ad);
  
  for(Integer x : ad) {
	  System.out.println(ad.poll());
  }
}
}
