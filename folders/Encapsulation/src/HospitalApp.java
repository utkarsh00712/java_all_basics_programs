import java.util.Scanner;
public class HospitalApp {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Hospital H = new Hospital(sc.nextInt(),sc.nextInt(),sc.nextLine());
	
	System.out.println("ID: " + H.getId() + " Bill: " + H.getBill() + " Name: " + H.getName());

	H.setId(001);
	H.setBill(500);
	H.setName("Rohan");
	
}
}
