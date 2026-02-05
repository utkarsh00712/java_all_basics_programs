package RuntimeErrors;

public class Demo {
public static void display() {
	System.out.println("Hello");
	display();
}
public static void main(String[] args) {
	display();
}
}
