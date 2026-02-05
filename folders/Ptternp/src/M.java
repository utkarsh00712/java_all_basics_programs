
public class M {
public static void main(String[] args) {
	for(int i = 0; i <=2; i++) {
		for(int j = 0; j <= 4; j++) {
			if(j==0||j==4||i==j||(i==1&& j==3)) {
				System.out.print("*");
			} else{
				System.out.print(" ");
			}
		}System.out.println();
	}
	for(int i=0; i<=1; i++) {
		for(int j=0; j <=4; j++) {
			if(j==0||j==4) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		} System.out.println();
	}
}
}
