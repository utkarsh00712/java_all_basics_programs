package jdbc.Advance;

public class InvalidCredentialExeption extends Exception {
  @Override
public String getMessage() {
	return "Invaild credentials applied";
}
}
