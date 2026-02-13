package RuntimeErrors;

public class BankAppd {
	public static void main(String[] args) {
		System.out.println("Connection to Main server Established");

		Bank b = new Bank();
		try {
			b.initiate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Connection to Main server Terminated");

	}
}
