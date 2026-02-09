package ArrayDequeue;

import java.util.*;

public class QueueUsinhArrayDequeue {
public static void main(String[] args) {
	
	ArrayDeque queue = new ArrayDeque();
	
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
