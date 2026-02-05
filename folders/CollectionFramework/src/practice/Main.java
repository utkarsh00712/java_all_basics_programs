package practice;

import java.util.*;

class Main {
    public static List<Integer> findKSmallest(int[] arr, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
       for(int x: arr) {
    	   pq.add(x);
    	   
       }
       
       ArrayList<Integer> al = new ArrayList<Integer>(pq);
       Collections.sort(al);
       
       ArrayList<Integer> al1 = new ArrayList<Integer>();
       for(int i = 0; i < k; i++) {
          al1.add(al.removeFirst()); 	   
       }
       return al1;
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input value of k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Find and print the k smallest elements
        List<Integer> result = findKSmallest(arr, k);
        System.out.println("Input: arr = " + Arrays.toString(arr) + ", k = " + k);
        System.out.println("Output: " + result);
    }
}
