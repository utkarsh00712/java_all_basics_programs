package InfosysGrooming;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int n = arr.length;
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            int count = 0; 
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            
            if (count >= n / 2) {
                System.out.println("Majority element: " + arr[i]);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Majority element not found");
        }
    }
}
