
public class BirdApp {
	public static void main(String[] args) {
		MountainEagle A = new MountainEagle();
		A.name = "Raghav";
		A.age = 15;
		A.eat();
		A.sleep();
		A.fly();
		
		SerpantEagle B = new SerpantEagle();
		B.name = "Muskan";
		B.age = 21;
		B.eat();
		B.sleep();
		B.fly();
		
		VegSparrow C = new VegSparrow();
		C.name = "Utkarsh";
		C.age = 21;
		C.eat();
		C.sleep();
		C.fly();
		
		NonvegSparrow D = new NonvegSparrow();
		D.name = "akshat";
		D.age = 21;
		D.eat();
		D.sleep();
		D.fly();
		
	}

}
