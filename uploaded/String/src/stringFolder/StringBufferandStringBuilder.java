package stringFolder;

public class StringBufferandStringBuilder {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Rama");
	System.out.println(sb);
	sb.append("Sita");
	System.out.println(sb);
	
	StringBuilder sbi = new StringBuilder("Rama");
	System.out.println(sbi);
	sbi.append("Sita");
	System.out.println(sbi);
}
}
