package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class WordFrequencyCounter {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	HashSet<String> words = new HashSet<String>();
	
	System.out.println("Enter a Sentence:");
	String [] str = sc.nextLine().toLowerCase().split("\\s+");
	
	for(String word: str) {
		words.add(word);
	}
	System.out.println("Unique Elements: " + words);
}
}
