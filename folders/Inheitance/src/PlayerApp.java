
public class PlayerApp {
	
		public static void main(String[] args) {
			
			cricketer c = new cricketer();
			c.name = "Kohli";
			System.out.println(c.name+" hobby is to play" + c.hobby);
			c.function();
			
			footballer f = new footballer();
			f.name = "Ronaldo";
			System.out.println(f.name + " hobby is to play" + f.hobby);
			f.function();
			
		}

}
