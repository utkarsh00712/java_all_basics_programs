package bitwiseoperetor;

public class operator {
public static void main(String[] args) {
	var a= 10;
	var b= a++ + a++ + ++a + a++ + ++a + --a + a-- + a++ + --a - a--;
	System.out.println(a +" "+ b);
}
}
