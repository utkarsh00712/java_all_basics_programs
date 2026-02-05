package StringFormatting;

	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Scanner;
	public class prac40 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // TODO: Format and print a large integer with commas
	        int number = sc.nextInt();
	        double pi = sc.nextDouble();
	        Date today = "";
	        SimpleDateFormat sdf = new SimpleDateFormat("E,MMM dd YYYY");
	        // TODO: Format and print a floating-point number with 2 decimal places
	        System.out.println(String.format("Formatted integer: %,d", number));
	        System.out.println(String.format("Formatted pi: %.2f", pi));
	        System.out.println("Date:" + sdf.format(today));
	        // TODO: Format and print the current date in the format "Day, Month Date Year"
	    }
	}

