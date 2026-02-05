
public class AnimalApp {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.name = "Raju tiger";
		t.habitat = "Dangerous tiger";
		t.eat();
		t.hunt();
		System.out.println("============================");
		Deer d = new Deer();
		d.name = "Khatarnak Deer";
		d.habitat = " Very fast Deer";
		d.eat();
		d.graze();
		System.out.println("=============================");
		Monkey m = new Monkey();
		m.name = "Akash";
		m.place = "Jharkhand";
		m.eat();
		m.steal();
	}

}
