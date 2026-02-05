package practice;

import java.util.Scanner;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String cap = "";

        for (int i = 0; i < arr.length; i++) {
            String sub = String.valueOf(arr[i].charAt(0)).toUpperCase();
            String sub1 = arr[i].substring(1);
            cap += sub + sub1 + " ";  // append instead of overwrite
        }

        System.out.print(cap.trim()); // remove trailing space
    }
}
