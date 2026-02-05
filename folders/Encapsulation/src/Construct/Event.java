package Construct;


public class Event {
	String eventName;
	int price;
	boolean hasCustomName;
	
	public Event() {
	super();
	}
	public Event(String eventName,int price) {
		this.eventName = eventName;
		this.price = price;
		
	}
	public Event(String eventName, int price, boolean hasCustomName) {
		this.eventName = eventName;
		this.price = price;
		this.hasCustomName = hasCustomName;
	}
	
	
	
	public void displayDetails2() {
		System.out.println("Event Name " + eventName);
		System.out.println("Price " + price);
		
	}
	
	public void displayDetails3() {
		System.out.println("Event: " +eventName);
		System.out.println("Price " + price);
		System.out.println("Custom Name " + hasCustomName);
	}
	

}

