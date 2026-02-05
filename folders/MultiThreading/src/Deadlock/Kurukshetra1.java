package Deadlock;

public class Kurukshetra1 {
public static void main(String[] args) {
	Warrior1 t1 = new Warrior1();
	Warrior1 t2 = new Warrior1();
	
	t1.setName("Karna1");
	t2.setName("Arjun1");
	
	t1.start();
	t2.start();
	
}
}
