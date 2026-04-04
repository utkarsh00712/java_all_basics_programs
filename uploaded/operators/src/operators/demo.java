package operators;

public class demo {
	public static void main(String[] args) {
		var a = 10;
		var b = 20;
		System.out.println("sum is "+ (a+b));
		System.out.println("difference is "+(a-b));
		System.out.println("product is "+(a*b));
		System.out.println("quotent is "+(a/b));
		System.out.println("remainder is "+(a%b));
		System.out.println("========================");
		System.out.println("10>20 ? " +(10>20));
		System.out.println("10<20 ? " +(10<20));
		System.out.println("10>=20 ? " +(10>=20));
		System.out.println("10<=20 ? " +(10<=20));
		System.out.println("10==20 ? " +(10==20));
		System.out.println("20==20 ? " +(20==20));
		System.out.println("10!=20 ? " +(10!=20));
		System.out.println("20!=20 ? " +(20!=20));
		System.out.println("======================");
		System.out.println("true && true"  +(true&&true));
		System.out.println("true && false " +(true&&false));
		System.out.println("false && true" +(false&&true));
		
		System.out.println("true || true" +(true||true));
		System.out.println("true || false" +(true||false));
		System.out.println("false || true" +(false||true));
		System.out.println("false || false" +(false||false));
		
		System.out.println("NOT TRUE" +(!true));
		System.out.println("NOT FALSE" +(!false));
		System.out.println("======================");
		
		
		
	}

}
