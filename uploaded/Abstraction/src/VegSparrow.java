
public class VegSparrow extends Sparrow {
String name;
	public VegSparrow(String name) {
		this.name = name;
		
	}

	void eat() {
		System.out.println( name + " Veg Sparrow is eating");
	}
	void fly() {
		System.out.println(name + " Veg Sparrow is Flying");
	}
	
}
