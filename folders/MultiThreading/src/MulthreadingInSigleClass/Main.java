package MulthreadingInSigleClass;

public class Main {
public static void main(String[] args) {
	System.out.println("Main method execution Started");
	Activity t1 = new Activity();
	Activity t2 = new Activity();
	Activity t3 = new Activity();
	
	t1.setName("bank");
	t2.setName("print");
	t3.setName("add");
	
	t1.start();
	t2.start();
	t3.start();
	System.out.println("Main Method Execution Ended");
}
}
