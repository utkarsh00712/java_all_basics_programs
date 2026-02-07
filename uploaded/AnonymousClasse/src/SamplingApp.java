
public class SamplingApp {
public static void main(String[] args) {
	Sampling s = new Sampling() {
		
		@Override
		public void display2() {
			System.out.println("World how are you");
			
		}
		
		@Override
		public void display1() {
			System.out.println("Hello");
			
		}
	};
	s.display1();
	s.display2();
}
}
