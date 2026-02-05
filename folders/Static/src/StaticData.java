
public class StaticData {
	public static void main(String[] args) {
		System.out.println(Database.url);
		System.out.println(Database.username);
		System.out.println(Database.pass);
		
	}
}
class Database {
	
	static String url;
	static String username;
	static String pass;
	
	static {
		url = "https";
		username = "Admin123";
		pass = "pass@124";
	}
	
}
