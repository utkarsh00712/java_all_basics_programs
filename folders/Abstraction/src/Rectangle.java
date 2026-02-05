import java.util.Scanner;
final public class Rectangle implements Shape {
private float length;
private float width;
private float area;
public float getLength() {
	return length;
}
public void setLength(float length) {
	this.length = length;
}
public float getWidth() {
	return width;
}
public void setWidth(float width) {
	this.width = width;
}
public float getArea() {
	return area;
}
public void setArea(float area) {
	this.area = area;
}
public Rectangle() {
	
}
@Override
public void acceptInput() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Provide the length and width of rectangle ");
	length = sc.nextFloat();
	width = sc.nextFloat();
	
}
@Override
public void calculateArea() {
	area = length * width;
	
}
@Override
public void displayArea() {
	System.out.println("The area of rectangle with length " + length +" and " + " width " + width + " is " + area);
	
}


}
