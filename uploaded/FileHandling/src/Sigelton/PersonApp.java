package Sigelton;

public class PersonApp {
public static void main(String[] args) {
	Person person1 = Person.getInstance(123, "Utkarsh",21,50000);
	System.out.println(person1);
	Person person2 = Person.getInstance(1234, "Harsh", 18, 500000);
	System.out.println(person2);
			
}
}
