package CustomAnnotations;

public class Employee {
String name;
int id;
int age;
private void greet() {
	System.out.println("Hello sir");
}

private void get(String name, int id, int age) {
	System.out.println("Name: " + name + " id " + id + " age " + age );
}

public Employee(String name, int id, int age) {
	super();
	this.name = name;
	this.id = id;
	this.age = age;
}

}
