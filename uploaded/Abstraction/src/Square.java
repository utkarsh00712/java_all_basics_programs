import java.util.Scanner;
final public class Square implements Shape {
	private float side;
	private float area;
	public Square() {
		super();
	}
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square");
		side = sc.nextFloat();
		
	}
	@Override
	public void calculateArea() {
		
		area = side*side;
		
	}
	@Override
	public void displayArea() {
		System.out.println("The area of Square with side " + side + "is" + area);
		
	}
	

}
