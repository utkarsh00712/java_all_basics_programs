package stringFolder;

public class InbuiltStringMethods {
public static void main(String[] args) {
	String s = "Raja Rama Mohana Raya";
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.charAt(3));
	System.out.println(s.indexOf("o"));
	System.out.println(s.startsWith("R"));
	System.out.println(s.endsWith("Raya"));
	System.out.println(s.length());
	System.out.println(s.substring(10));
	System.out.println(s.substring(10,15));
	System.out.println(s.substring(10,20));
	
	char arr[]=s.toCharArray();
	System.out.print("[");
	for(char c : arr) {
		System.out.print(c +" ");
	}
	System.out.println("]");
	System.out.println(s.replaceAll("a", "o"));
	
	String s2 = new String();
	System.out.println(s2.isEmpty());
	s2 = s2.concat("Hello");
	System.out.println(s2.isEmpty());
	String s3 = new String();
	System.out.println(s3.isEmpty());
	System.out.println(s3.isBlank());
	s3 = s3.concat(" ");
	System.out.println(s3.isEmpty());
	System.out.println(s3.isBlank());
	
	
}
}
