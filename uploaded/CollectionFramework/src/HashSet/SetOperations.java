package HashSet;

import java.util.HashSet;


public class SetOperations {
public static void main(String[] args) {
	
	
	HashSet<Integer> set1 = new HashSet<Integer>();
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	set1.add(5);
	System.out.println(set1);
	HashSet<Integer> set2 = new HashSet<Integer>();
	set2.add(3);
	set2.add(4);
	set2.add(5);
	set2.add(6);
	set2.add(7);
	System.out.println(set2);
	
	HashSet<Integer> union = new HashSet<Integer>(set1);
	union.addAll(set2);
	System.out.println(union);
	
	HashSet<Integer> intersection = new HashSet<Integer>(set1);
	intersection.retainAll(set2);
	System.out.println(intersection);
	
	HashSet<Integer> diff = new HashSet<Integer>();
	diff.removeAll(set2);
	System.out.println(diff);	
}
}
