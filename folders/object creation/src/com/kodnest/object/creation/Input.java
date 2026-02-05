package com.kodnest.object.creation;
import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("New Byte input ");
		byte a = scan.nextByte();
		System.out.println("Byte output is "+ a);
		
		System.out.println("New short input");
		Short b =  scan.nextShort();
		System.out.println("Short output is "+ b);
		
		System.out.println("New int input");
		 int c =scan.nextInt();
		 System.out.println("integer output is "+ c);
		
		 scan.nextLine();
		System.out.println("enter String1 ");
		String d =scan.nextLine();
		System.out.println("string 1 output is "+ d);
		
		scan.nextLine();
		System.out.println("enter string2 ");
		String e = scan.nextLine();
		System.out.println("String 2 output is "+ e);
		
		System.out.println("New float value ");
		 float f =scan.nextFloat();
		 System.out.println("float output is "+ f);
		 
		 System.out.println("New double value ");
		double g = scan.nextDouble();
		System.out.println("double output is "+ g);
		 
		 System.out.println("New boolean value ");
		boolean h = scan.nextBoolean();
		System.out.println("boolean  output is "+ h);
		 
		 System.out.println("New character ");
		 char i = scan.next().charAt(0);
		 System.out.println("char output is "+ i);
		
		
	}

}
