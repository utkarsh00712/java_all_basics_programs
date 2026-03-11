package StringBufferAndStringBuilder;

public class Demo {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Rama"); // creating a sttringBuffer with string parameter
	sb.append("Sita"); // appending value
	System.out.println(sb);
	System.out.println("=================================");
	
	StringBuffer sbu = new StringBuffer(); // creating a StringBuffer with no parameter
	// the non paramaetrerized StringBuffer has default Storage capacity of 16 characters
	
	System.out.println(sbu.capacity()); // checking the capacity of the stringbuffer
	sbu.append("Omkar is a batsman");
	System.out.println(sbu.capacity());
	sbu.append(" He lives in Bengaluru");
	System.out.println(sbu.capacity());
	System.out.println(sbu);
	
	System.out.println("=======================================");
	// other way of creating StringBuffer
	StringBuffer sb1 = new StringBuffer(100); // creating a StringBufffer that can Strore 100 values
	System.out.println(sb1.capacity());
	
	//craeting a new StringBuffer with the method
	StringBuffer sb2 = new StringBuffer();
	sb2.ensureCapacity(200);
	System.out.println(sb2.capacity());
}
}
