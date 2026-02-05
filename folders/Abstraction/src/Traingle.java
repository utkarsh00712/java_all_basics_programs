import java.util.Scanner;
final public class Traingle implements Shape{
public float height;
public float base;
public float area;
public float getArea() {
	return area;
}
public void setArea(float area) {
	this.area = area;
}
public Traingle() {
	super();
}
public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
}
public float getBase() {
	return base;
}
public void setBase(float base) {
	this.base = base;
}
@Override
public void acceptInput() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter base and height of traingle ");
	height = sc.nextFloat();
	base = sc.nextFloat();
	}
@Override
public void calculateArea() {
	area = 1/2 * base * height;
	
}
@Override
public void displayArea() {
	System.out.println("the area of traingle with base and height " + base + " and " + height + " is " + area);
	
	
}


}
