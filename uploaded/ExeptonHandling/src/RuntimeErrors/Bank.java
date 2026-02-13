package RuntimeErrors;

public class Bank {
public static void initiate() throws Exception {
	System.out.println("Connection to bank server Established");
	try {
	ATM a1 = new ATM();
	a1.validate();
	} catch(Exception e) {
		throw e;
	}
	finally {
	System.out.println("Connection to bank server Terminated");
	}
}
}
