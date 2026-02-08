package ArrayPractice;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int arr1[] = new int[sc.nextInt()];
        //loop to take input for original array
        for(int i = 0; i <= arr1.length-1; i++) {
        arr1[i] = sc.nextInt();
        	}
       
        // condition to declare reverse array
         int arr2 []= new int[arr1.length];
         int j = arr1.length-1;
         
         // condition to reverse an array
         for(int i = 0; i <= arr1.length-1; i++) {
        	 arr2[j] = arr1[i];
        	 j--;
         }
         // print original array
         System.out.print("[ ");
         for(int i = 0; i <= arr1.length-1; i++) {
        	 System.out.print(arr1[i]);
        	 if(i != arr1.length-1) {
        		 System.out.print(", ");
        	 }
        	 
         }
         System.out.println("]");
         
         // print reverse array
         System.out.print("[ ");
         for(int i = 0; i <= arr2.length-1; i++) {
        	 System.out.print(arr2[i]);
        	 if(i != arr2.length-1) {
        		 System.out.print(", ");
        	 }
         }
         System.out.println("]");
        
       
	}
}


