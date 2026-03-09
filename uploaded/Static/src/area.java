import java.util.Scanner;
public class area {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String type = sc.nextLine();
	switch(type) {
	case"rectangle":
		int l = sc.nextInt();
		int w = sc.nextInt();
		
		System.out.println(calcArea.rec(l, w));
		break;
	case "circle":
		double r = sc.nextDouble();
		System.out.println(calcArea.circle(r));
	}
}
}
class calcArea {
	public static int rec(int l,int w) {
		return l*w;
		}
	public static double circle(double r) {
		return 3.14*r*r;
	}
	
}
