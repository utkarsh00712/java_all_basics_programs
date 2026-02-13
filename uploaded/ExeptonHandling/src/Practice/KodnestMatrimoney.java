package Practice;

public class KodnestMatrimoney {
  void initiate() {
	  Applicant apk = new Applicant();
	  
	  try {
		  apk.takeInput();
		  apk.validate();
	  } catch(Exception e) {
		try {
			apk.takeInput();
			  apk.validate();
		} 
		catch(Exception e2) {
			try {
				apk.takeInput();
				  apk.validate();
			} catch(Exception e3) {
			 System.out.println("Issue reached to matrimoney");
				  e.printStackTrace();
			}
		}
	  }
  }
}
