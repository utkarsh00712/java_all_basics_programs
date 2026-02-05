package Practice;

public class OverAgeException extends Exception{

	@Override
	public String getMessage() {
		
		return "You are too old for marrige";
	}
}
