package RuntimeErrors;

public class BankApp {
public static void main(String[] args) {
	System.out.println("Connection to Main server Established");

	Bank b = new Bank();
	try {
		b.initiate();
	} catch (Exception e) {
		
	}
	System.out.println("Connection to Main server Terminated");

}
}
