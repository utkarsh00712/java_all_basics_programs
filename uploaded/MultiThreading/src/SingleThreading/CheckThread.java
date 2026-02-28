package SingleThreading;

public class CheckThread {
public static void main(String[] args) {
 Thread t = Thread.currentThread();
 System.out.println(t);
 t.setName("Utkarsh");
 t.setPriority(2);
 System.out.println(t);
}
}
