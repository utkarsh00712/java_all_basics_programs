
public class StarTraingle {
	public static void printTraingle(int n) {
		
	
for(int i = 1; i < n; i++) {
	for(int j = 1; j < n-1; j++) {
		System.out.print(" ");
	}
	for(int k = 1; k <= i; k++) {
		System.out.print("*" + " ");
	}System.out.println();
} 
}
	public static void main(String[] args) {
		printTraingle(6);
	}
}
