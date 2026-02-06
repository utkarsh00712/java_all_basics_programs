package CustomAnnotationWithReflextion;

public class KodApp {
@Validate(min = 5, max = 500, message = "Performing Validation is mandatory with Method")
String userName;
	public void greet() {
		System.out.println("Good AfterNoon Sir");
	}
}
