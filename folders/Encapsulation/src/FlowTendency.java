
public class FlowTendency {
	//declare static variable
	static int staticvar = 10;
	//declare instance variable
	int instancevar = 20;
	//static block
	static 
	{
	System.out.println("static block ececuted: " + staticvar);
	staticvar = 30;
	}

	// instance block
	{
		System.out.println("nstace block executed: " + instancevar);
		instancevar = 40;
	}
	//static method
	public static void printstatic() {
		System.out.println("the updated Ststic variable: "+staticvar);
	}
	// instance method
	public void printinstance() {
		System.out.println("the updated instance variable: " + instancevar);
	}
	// constructor
	public FlowTendency() {
		System.out.println("The instance variable is : " + instancevar);
	}
	public static void main(String[] args) {
	
		FlowTendency F = new FlowTendency();
		F.printinstance();
		FlowTendency.printstatic();
	}	
}
