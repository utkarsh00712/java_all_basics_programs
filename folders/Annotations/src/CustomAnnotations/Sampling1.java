package CustomAnnotations;

public class Sampling1 {
 @validate1(message="This method is used to validate age", min = 18, max = 60)
	void validateAge(int age) {
		System.out.println("Age is " + age);
	}
}
