
public class Person {
String name;
int age;

public Person(String name,int age) {
	this();
	System.out.println("Person parameter Constructor executed");
	this.name = name;
	this.age = age;
	}

public Person() {
	System.out.println("Person zero parameter constructer executed");
	name = "Raja";
	age = 25;
}
}
