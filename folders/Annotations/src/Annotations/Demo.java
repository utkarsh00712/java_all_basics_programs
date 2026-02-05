package Annotations;

public class Demo extends Sample1{
	@Override
 public void display() {
	 System.out.println("Hello World");
 }
	@Override
	@Deprecated
	public void display1() {
		System.out.println("Hello");
	}
}
