package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoArrayList {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the number of colors for the first list (n1)
        int n1 = sc.nextInt();
        sc.nextLine();
        
        // TODO: Create an ArrayList to store first list of colors
        ArrayList <String> al = new ArrayList(n1);
        // TODO: Read and add n1 colors to the first ArrayList
        for(int i  = 0; i <n1; i++) {
            al.add(sc.nextLine());
        }
        
        // TODO: Read the number of colors for the second list (n2)
        int n2 = sc.nextInt();
        sc.nextLine();
        // TODO: Create an ArrayList to store second list of colors
        ArrayList <String> al2 = new ArrayList(n2);
        // TODO: Read and add n2 colors to the second ArrayList
        for(int i = 0; i < n2; i++) {
            al2.add(sc.nextLine());
        }
        // TODO: Merge both ArrayLists into a new ArrayList
        ArrayList <String> al3 = new ArrayList(al);
        al3.addAll(al2);
        
        for(String x : al3) {
        	System.out.print(x + " ");
        }
        
        
        
        // TODO: Print all three lists as per the output format
        sc.close();
    }
}
