package ArrayDequeue;
import java.util.*;
public class QueueUsingLinkedList {
public static void main(String[] args) {
	
	Queue queue = new LinkedList();
	
	queue.add(10);
	queue.add(20);
	queue.add(30);
	queue.add(40);
	queue.offer(50);
	
	System.out.println(queue);
	
	System.out.println(queue.poll());
	System.out.println(queue);
	
	System.out.println(queue.poll());
	System.out.println(queue);
	
	System.out.println(queue.poll());
    System.out.println(queue);
	
	System.out.println(queue.poll());
	System.out.println(queue);
	
	System.out.println(queue.remove());
	System.out.println(queue);
	
	
	
}
}
