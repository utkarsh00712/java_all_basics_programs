
public class CasioCalculator implements Calculate {
	
	public void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("The addition result is " + c);
	}

	
	public void sub() {
		int a = 50;
		int b = 10;
		int c = a-b;
System.out.println("The subtarction result is " + c);		
	}

	@Override
	public void mul() {
		int a = 10;
		int b = 2;
		int c = a*b;
		System.out.println("The multiplication result is "+ c);
		
	}

	@Override
	public void div() {
		int a = 10;
		int b = 5;
		int c = a/b;
		System.out.println("The division result is " + c);
		
	}

}
