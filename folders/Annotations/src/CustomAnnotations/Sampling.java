package CustomAnnotations;

public class Sampling {
  @validate(message ="This method is used for validation purpose")
	void validateAge(int age) {
		System.out.println("Age is " + age);
	}
}
