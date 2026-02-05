package Practice;

public class Bank {


void initiate() {
	ATM atm = new ATM();
	try {
	atm.takeInput();
	atm.validate();
	} catch(Exception e) {
		System.out.println("Issue reached to bank");
		e.printStackTrace();
	}
}
}
