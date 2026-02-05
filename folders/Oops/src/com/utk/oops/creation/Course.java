package com.utk.oops.creation;

public class Course {
	int id;
	String name;
	String mentor;
	int duration;
	
	void start() {
		System.out.println("course is Starting from june.");
	}
void learn() {
	System.out.println("Students ore learning course from "+mentor );
}
void end() {
	System.out.println("course ends after completeion in " + duration +" months.");
}
}
