package com.kodnest.object.creation;

public class PenFunction {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		Pen p2 = new Pen();
		 p1.type = "gelpen";
		 p1.brand = "Reynolds";
		 p1.color = "blue";
		 p1.cost = 10;
	
    p1.write();
	p1.task();
	 System.out.println();
	System.out.println(p1.type);
	System.out.println(p1.brand);
	System.out.println(p1.color);
	System.out.println(p1.cost);
	System.out.println();
	
	p2.write();
	p2.task();
	p2.type = "Ball pen";
	p2.brand ="Cello";
	p2.color = "Black";
	p2.cost = 20;
	System.out.println();
	System.out.println(p2.type);
	System.out.println(p2.brand);
	System.out.println(p2.color);
	System.out.println(p2.cost);
	System.out.println();
	
	
	}

}
