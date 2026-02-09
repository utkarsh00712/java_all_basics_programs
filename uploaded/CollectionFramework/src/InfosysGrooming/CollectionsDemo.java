package InfosysGrooming;
import java.util.*;
public class CollectionsDemo {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(100);
	list.add(50);
	list.add(150);
	list.add(25);
	list.add(75);
	list.add(125);
	System.out.println("ArrayList-> " + list);
	System.out.println("==========================");
	LinkedList list2 = new LinkedList();
	list2.add(100);
	list2.add(50);
	list2.add(150);
	list2.add(25);
	list2.add(75);
	list2.add(125);
	System.out.println("LinkedList-> " + list2);
	System.out.println("==========================");
	
	ArrayDeque queue = new ArrayDeque();
	
	queue.addFirst(9999); //  can add element first and last
	queue.add(100);
	queue.add(50);
	queue.add(150);
	queue.add(25);
	queue.add(75);
	queue.add(125);
	System.out.println("ArrayDeque -> " + queue);
	System.out.println("==========================");
	
	PriorityQueue queue2 = new PriorityQueue();
	queue2.add(100);
	queue2.add(50);
	queue2.add(150);
	queue2.add(25);
	queue2.add(75);
	queue2.add(125);
	System.out.println("PriorityQueue-> " + queue2);
	System.out.println("========================");
	
	TreeSet set = new TreeSet();
	
	set.add(100);
	set.add(50);
	set.add(150);
	set.add(25);
	set.add(75);
	set.add(125);
	System.out.println("TreeSet-> " + set);
	System.out.println("==========================");
	
	HashSet set2 = new HashSet();
	
	set2.add(100);
	set2.add(50);
	set2.add(150);
	set2.add(25);
	set2.add(75);
	set2.add(125);
	System.out.println("HashSet-> " + set2);
	System.out.println("==========================");
	
	LinkedHashSet set3 = new LinkedHashSet();
	set3.add(100);
	set3.add(50);
	set3.add(150);
	set3.add(25);
	set3.add(75);
	set3.add(125);
	System.out.println("LinkedHashSet-> " + set3);
	System.out.println("==========================");
	
}
}
