
public class Child extends Parent{
	public Child(String name) {
		this.name = name;
	}
	
	void displayDetails() {
		System.out.println("Child name is " + name);
	}
	void drink() {
		System.out.println(name + " child is drinking coke.");
	}

}
