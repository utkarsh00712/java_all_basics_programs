package stringFolder;

public class Example1 {
public static void main(String[] args) {
	String s1 = "Rama";
	String s2 = "Sita";
	String s3 = "Rama" + "Sita";
	String s4 = "Rama" + "Sita";
	
	if(s3 == s4) {
		System.out.println("References Are Equal");
	} else {
		System.out.println("References are not Equal");
	}
	
	if(s3.equals(s4)) {
		System.out.println("String values Are Equal");
	} else {
		System.out.println("String values Are not Equal");
	}
}
}
