package comparisonOfStrings;

public class Sample {
public static void main(String[] args) {
	String s1 = "Kodnest";
	String s2 = "Kodnest";
	String s3 = "KoDnEst";
	String s4 = "Government";
	
	if(s1==s2) {
		System.out.println("The references of s1 " + s1 + "And s2 " + s2 + " Are Equal" );
	} else {
		System.out.println("The references of s1 " + s1 + "And s2 " + s2 + " Are not Equal" );

	}
	
	if(s1.equals(s3)) {
		System.out.println("String values of String s1 " + s1 + " and String s3 " + s3 + " Are equal");
	} else {
		System.out.println("String values of String s1 " + s1 + " and String s3 " + s3 + " Are not equal");
}
	if(s1.equalsIgnoreCase(s3)) {
		System.out.println("String values of s1 " + s1 + " is equal to s3 " + s3 + " by ignoring cases");
	} else {
		System.out.println("String values of s1 " + s1 + " is not equal to s3 " + s3 + " by ignoring cases");
}
	
	int res = s1.compareTo(s4);
	System.out.println("Result value " + res);
	
	if(res>0) {
		System.out.println("String values of s1= " + s1 + " is greater than s4=" + s4);
	} else if(res<0) {
		System.out.println("String values of s1= " + s1 + " is less than s4=" + s4);
	} else {
		System.out.println("String values of s1= " + s1 + " is equal to s4" + s4);
	}
	
}
}
