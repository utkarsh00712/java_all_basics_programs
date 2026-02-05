package StringBufferAndStringBuilder;

public class Methods {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Hello");
	sb.append(" World");
	sb.insert(5,",");
	System.out.println(sb);
	sb.delete(5,6);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
}
}
