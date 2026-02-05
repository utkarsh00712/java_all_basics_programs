
public class Child extends parent {
	int a = 999;
	
	
	void display() {
		super.display();
		System.out.println("Displaying value " + a + " from child");
		System.out.println("Displaying value " + super.a + " from Child");
	}

}
