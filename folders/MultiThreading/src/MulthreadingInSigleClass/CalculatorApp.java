package MulthreadingInSigleClass;

public class CalculatorApp {
public static void main(String[] args) {
	Calculator calc = new Calculator();
	
	Thread t1 = new Thread(calc);
	Thread t2 = new Thread(calc);
	Thread t3 = new Thread(calc);
	
	t1.setName("add");       
	t2.setName("sub");   
	t3.setName("mul");
	
	t1.start();
	t2.start();
	t3.start();
}
}
