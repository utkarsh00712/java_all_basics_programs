
public class Static {
public static void main(String[] args) {

	
	
	System.out.println(configuration.config());
}
}
class configuration{
	
	static int a;
	
	static
	{
		a = 1024;
	}
	public static int config() {
		return a;
	}
	
}
