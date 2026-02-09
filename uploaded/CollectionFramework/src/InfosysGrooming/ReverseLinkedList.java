package InfosysGrooming;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		LinkedList<String> playlist = new LinkedList<String>();
		
		
		for(int i = 0; i <= n-1; i++) {
			playlist.add(sc.nextLine());
		}
		
		Collections.reverse(playlist);
		
		for(String song: playlist) {
			System.out.print(song + " ");
		}
	}
}
