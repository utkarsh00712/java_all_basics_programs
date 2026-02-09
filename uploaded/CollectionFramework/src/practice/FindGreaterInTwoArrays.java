package practice;

import java.util.*;


public class FindGreaterInTwoArrays {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int nums1 []= new int[n1]; 
	for(int i = 0; i < n1; i++ ) {
		nums1[i] = sc.nextInt();
	}
	
	int n2 = sc.nextInt();
	int nums2[]  = new int[n2];
	for(int i = 0; i< n2;i++) {
		nums2[i] = sc.nextInt(); 
	}
	System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
}

public static int[] nextGreaterElement(int nums1[], int nums2[]) {
	
	
	HashMap<Integer, Integer> hs = new HashMap();
	
	ArrayDeque <Integer> stack = new ArrayDeque<Integer>();
	
	for(int num: nums2) {
		while(!stack.isEmpty()&& num > stack.peek()) {
			int previousSmall = stack.pop();
			hs.put(previousSmall, num);
		}
		stack.push(num);
	}
	
	while(!stack.isEmpty()) {
		hs.put(stack.pop(), -1);
	}
	
	int result [] = new int[nums1.length];
	for(int i = 0; i < nums1.length;i++) {
		result[i] = hs.get(nums1[i]);
	}
	
	return result;
}
}
