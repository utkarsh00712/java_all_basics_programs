
 public class Print {

	 // Instance variable
	 int id;
String name;
	
// static variable
	 
	 static int id1;
static String name1;
	 
// instance block

{
	System.out.println("Instance Block");
	id = 101;
	name = "Utkarsh";
}

// static block
static {
	id1 = 102;
	name1 = "Vivek";
	System.out.println("Static Bolck");
}

// instance method

public void display() {
	System.out.println("Instance block");
	System.out.println("Id: " + id + "Name: " + name);
	
}

// static method
public static void display1() {
	System.out.println("Static bolck");
	System.out.println("Id1: " + id1 + "Name1: " + name1);
}

// Constructor
public Print(int id,String name) {
	System.out.println("Static Method");
	this.id =  id;
	this.name=name;
}

public Print(Print ref) {
	this.id =  ref.id;
	this.name= ref.name;
}
public static void main(String[] args) {
	
	Print P = new Print(501,"Akash");
	P.display();
	Print.display1();
	
}

}
