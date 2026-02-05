import java.util.Scanner;
public class Cylinder implements Shape{
private float radius;
public Cylinder() {
	
}
private float height;
private float area;
public float getRadius() {
	return radius;
}
public void setRadius(float radius) {
	this.radius = radius;
}
public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
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
	System.out.println("Enter radius and height of thr cylinder ");
	radius = sc.nextFloat();	
	height = sc.nextFloat();	
}
@Override
public void calculateArea() {
	area = (2 * PI * radius * radius) + (2*PI * radius*height);
	
}
@Override
public void displayArea() {
	System.out.println("Area of cylinder with radius " + radius + " And Height " + height + "is" + area);
	
}

}
