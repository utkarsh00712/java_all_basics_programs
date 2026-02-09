package Generics;

import java.util.*;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String type = sc.next();  // FIXED: use next() to correctly read the type

        if (type.equals("Integer")) {
            LinkedList<Integer> ll = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                ll.add(sc.nextInt());
            }
            System.out.println(ll.size());
            for (Integer x : ll) {
                System.out.print(x + " ");
            }

        } else if (type.equals("String")) {
            LinkedList<String> ll = new LinkedList<>();
            sc.nextLine(); // consume newline before reading strings
            for (int i = 0; i < n; i++) {
                ll.add(sc.nextLine());
            }
            System.out.println(ll.size());
            for (String x : ll) {
                System.out.print(x + " ");
            }

        } else if (type.equals("Double")) {
            LinkedList<Double> ll = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                ll.add(sc.nextDouble());
            }
            System.out.println(ll.size());
            for (Double x : ll) {
                System.out.print(x + " ");
            }

        } else {
            System.out.println("Invalid type!");
        }
    }
}

