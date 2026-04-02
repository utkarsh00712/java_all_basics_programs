package com.kodnest.object.creation;

public class DogActivity {
	public static void main(String[] args) {
		
	
	Dog d1 = new Dog();
	d1.name = "raghav";
	d1.breed = "lebra";
	d1.color = "brown";
	d1.cost = 5000;
	System.out.println(d1.name);
	System.out.println(d1.breed);
	System.out.println(d1.color);
	System.out.println(d1.cost);
	
	d1.bark();
	d1.run();
	d1.eat();
	System.out.println();
	Dog d2 = new Dog();
	d2.name = "jackie";
	d2.breed = "pitbull";
	d2.color = "black";
	d2.cost = 50000;
	d2.bark();
	d2.eat();
	d2.run();
	
	System.out.println("his name is "+ d2.name );
	System.out.println("the breed is "+d2.breed);
	System.out.println("color of dog is " + d2.color);
	System.out.println("the price "+ d2.cost);
	System.out.println("his name is " + d2.name );
	
	}
}
