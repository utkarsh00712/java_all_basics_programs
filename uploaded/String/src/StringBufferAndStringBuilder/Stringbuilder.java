package StringBufferAndStringBuilder;

public class Stringbuilder {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("Rama");
	sb.append("Sita");
	System.out.println(sb);
	System.out.println("====================");
	
	StringBuilder sbu = new StringBuilder();
	System.out.println(sbu.capacity());
	sbu.append("Omkar is a batsman");
	System.out.println(sbu.capacity());
	sbu.append("He lives in Bengaluru");
	System.out.println(sbu.capacity());
	System.out.println(sbu);
	System.out.println("====================================");
	
	StringBuilder sb1 = new StringBuilder(100);
	System.out.println(sb1.capacity());
	System.out.println("=====================================");
	
	StringBuilder sb2 = new StringBuilder();
	sb2.ensureCapacity(200);
	System.out.println(sb2.capacity());
}
}
