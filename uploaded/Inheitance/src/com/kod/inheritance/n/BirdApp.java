package com.kod.inheritance.n;

public class BirdApp {
	public static void main(String[] args) {
		
		Eagle A = new Eagle();
		A.name = " Baaj";
		A.habitat = " Mountain";
		A.eat();
		A.hunt();
		System.out.println("======================");

		GoldenEagle B = new GoldenEagle();
		B.name = " Baaj";
		B.foodType = " Non veg";
		B.habitat = " Sea";
		B.eat();
		B.foodHabit();
		B.hunt();
		System.out.println("======================");
		
		Sparrow S = new Sparrow();
		S.name = " Rani";
		S.place = " Sky";
		S.eat();
		S.pick();
		System.out.println("======================");
		VegSparrow V = new VegSparrow();
		V.name = " Rani ki Bahan";
		V.place =" Land";
		V.foodType=" Daana";
		V.eat();
		V.pick();
		V.foodHabit();
		System.out.println("======================");
	}

}
