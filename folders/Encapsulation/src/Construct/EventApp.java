package Construct;



public class EventApp {
public static void main(String[] args) {
	
	Event event1 = new Event();
	Event event2 = new Event("tech fest",500);
	Event event3 = new Event("tech fest",700,true);
	
	event1.displayDetails2();
	
	System.out.println("-------------");
	event2.displayDetails2();
	System.out.println("-------------");
	event3.displayDetails3();
}
}
