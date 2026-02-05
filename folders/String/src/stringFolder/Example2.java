package stringFolder;

public class Example2 {
public static void main(String[] args) {
	String s1 = "Rama";
	String s2 = "Sita";
	String s3 = s1 + s2;
	String s4 = s1 + s2;
	
	if(s3 == s4) {
		System.out.println("References are Equal");
	} else {
		System.out.println("References are not Equal");
	}
	
	if(s3.equals(s4)) {
		System.out.println("String values are Equal");
	} else {
		System.out.println("String values are not Equal");
	}
}
}
