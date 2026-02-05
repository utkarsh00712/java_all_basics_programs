package stringFolder;

public class StringImmutable {
public static void main(String[] args) {
	
	String s1 = new String("Rama");
	String s2 = new String("Rama");
	
	// Equal to operator Compares the References of Object
	if(s1 == s2) {
		System.out.println("The References of S1 and S2 are Equal");
	}
	else {
		System.out.println("The refrences of S1 and S2 are not Equal");
	}
	
	// Compares the value of String
	
	if(s1.equals(s2)) {
		System.out.println("The values of the String are Equal");
	}
	else {
		System.out.println("The values of String are not Equal");
	}
	
	// 
}
}

