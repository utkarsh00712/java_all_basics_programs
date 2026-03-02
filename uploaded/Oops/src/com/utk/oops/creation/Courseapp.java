package com.utk.oops.creation;

public class Courseapp {
	public static void main(String[] args) {
		Course c1= new Course();
		c1.id = 123;
		c1.name = "java";
		c1.mentor = "puneet kumar";
		c1.duration = 6;
		
		c1.start();
		c1.learn();
		c1.end();
	}

}
