package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for input strings
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
           String str3 =str + str1;
     
        if(str3.contains(str1)) {
            System.out.println("The string " + str1 + " is a rotation of " + str);
        }
        // TODO: Check if the second string is a rotation of the first
        // TODO: Print result
        scanner.close();
    }
}
