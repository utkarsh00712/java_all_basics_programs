package Multithreading;

public class Main {
public static void main(String[] args) {
	Banking t1 = new Banking();
	Printing t2 = new Printing();
	Addition t3 = new Addition();
	
	t1.start();
	t2.start();
	t3.start();
			
}
}
