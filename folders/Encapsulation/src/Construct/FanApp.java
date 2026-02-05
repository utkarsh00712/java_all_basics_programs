package Construct;

public class FanApp {
public static void main(String[] args) {
	
	Fan f1 = new Fan(4,"Crompton","Red");
	System.out.println(f1.numberOfWings +" " +f1.brand + " " + f1.color);
	
	Fan f2 = new Fan(0, null, null);
	System.out.println(f2.numberOfWings + f2.brand + f2.color);

}

}
