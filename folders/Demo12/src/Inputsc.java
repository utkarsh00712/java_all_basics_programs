import java.util.Scanner;

public class Inputsc {
	public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    
    System.out.println("my name");
    String a = scan.nextLine();
    System.out.println("my name is ;" + a);
   
   scan.nextLine();
    System.out.println("institute");
    String b = scan.nextLine();
    System.out.println("i am learning java in : " + b);
	}

}
