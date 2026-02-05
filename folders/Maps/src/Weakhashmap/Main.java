package Weakhashmap;

import java.util.IdentityHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		WeakHashMap<Integer, String> token = new WeakHashMap<Integer, String>();
		
		for(int i = 0; i < n; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			token.put(key, value);
			System.out.println("Added token: " + key + " -> " + value);
		}

		System.out.println("Enter a token id to check");
		int tokenId = sc.nextInt();
		
		boolean hasTokenId = token.containsKey(tokenId);
		if(hasTokenId) {
			System.out.println("The token " + tokenId + " exists: " + hasTokenId);
		}
		
		System.out.println("All active token id sessions");
		
		for(Entry<Integer, String> entry:token.entrySet()) {
			System.out.println(entry.getKey() +" -> " + entry.getValue());
		}
		
		int n1 = sc.nextInt();
		
		IdentityHashMap<Integer, String> ihm = new IdentityHashMap<Integer, String>();
		for(int i = 0; i < n1; i++) {   // ✅ Changed n to n1
			int id = sc.nextInt();
			String name = sc.next();
			ihm.put(id, name);
			System.out.println("Added user: " + id + " -> " + name);
		}
		
		System.out.println("Are two data identical " + ihm.containsKey(1));
		
		}
	}

