package Practice;

public class LessAgeException extends Exception {
 
	@Override
	public String getMessage() {
		
		return "You Are too young to get married" ;
	}
}
