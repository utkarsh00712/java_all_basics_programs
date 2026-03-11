package StringFormatting;

import java.text.MessageFormat;

public class MessegeFormat {
public static void main(String[] args) {
	String str = "Hello {0} How are you? Did you eat {1}";
	String finalstr = MessageFormat.format(str, "omkar","Lunch");
	System.out.println(finalstr);
}
}
