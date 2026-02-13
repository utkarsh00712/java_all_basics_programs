package RuntimeErrors;

public class Bankd {
	public static void initiate() throws Exception {
		System.out.println("Connection to bank server Established");
		try {
		ATM a1 = new ATM();
		a1.validate();
		} 
		finally {
		System.out.println("Connection to bank server Terminated");
		}
	}
}
