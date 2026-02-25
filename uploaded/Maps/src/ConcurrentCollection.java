import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollection {
public static void main(String[] args) {
	CopyOnWriteArrayList al = new CopyOnWriteArrayList();
	al.add(100);
	al.add(50);
	al.add(150);
	al.add(75);
	al.add(125);
	
	Iterator itr = al.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
		al.add(999);
	}
	System.out.println(al);
}
}
