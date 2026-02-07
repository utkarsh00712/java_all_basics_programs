
public class SmapleApp {
	public static void main(String[] args) {
		
	
   Sample s = new Sample() {
	
	   void display1() {
		   System.out.println(" Hello");
		   
	   }
	@Override
	void display2() {
		System.out.println("World");
		
	}
	
	
	
};
s.display1();
s.display2();
}
}
