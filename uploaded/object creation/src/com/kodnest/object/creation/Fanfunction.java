package com.kodnest.object.creation;

public class Fanfunction {
	public static void main(String[] args) {
		
	
Fan f1 =new Fan(); 
f1.noOfBlades = 4;
f1.brand ="orient";
f1.color ="green";
f1.cost = 1500;
System.out.println();
System.out.println("Number of blades: " + f1.noOfBlades);
System.out.println("Name of brand: " + f1.brand);
System.out.println("Color of fan: " + f1.color);
System.out.println("Cost of fan: " + f1.cost);
System.out.println();
f1.rotate();
f1.giveair();
System.out.println();


Fan f2 = new Fan();
f2.noOfBlades = 3;
f2.brand ="bajaj";
f2.color ="black";
f2.cost =1000;
System.out.println();
System.out.println("Number of blades: " + f2.noOfBlades);
System.out.println("Name of brand: " + f2.brand);
System.out.println("Color of fan: " + f2.color);
System.out.println("Cost of fan: " + f2.cost);
System.out.println();
f2.rotate();
f2.giveair();
System.out.println();


Fan f3 = new Fan();
f3.noOfBlades = 5;
f3.brand ="havells";
f3.color ="blue";
f3.cost =1200;
System.out.println("Number of blades: " + f3.noOfBlades);
System.out.println("Name of brand: " + f3.brand);
System.out.println("Color of fan: " + f3.color);
System.out.println("Cost of fan: " + f3.cost);
System.out.println();
f3.rotate();
f3.giveair();
System.out.println();
}
}