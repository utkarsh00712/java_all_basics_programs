package InfosysGrooming;

import java.util.Scanner;

public class FindFirstPeak {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int nums[] = new int[sc.nextInt()];
	
	for(int i = 0; i <= nums.length-1; i++) {
		nums[i] = sc.nextInt();
	}
	System.out.println(findFirstPeakElement(nums));
}
public static int findFirstPeakElement(int[]nums) {
	if(nums.length == 1) {
		return 0;
	}
	for(int i =0; i <= nums.length-1; i++) {
		if(i == 0 && nums[i] > nums[i +1]) {
			return i;
		} 
		else if(i == nums.length-1 && nums[i] > nums[i-1]) {
			return i;
		} else if(i != 0 && i != nums.length-1) {
			if(nums[i] > nums[i-1] && nums[i]>nums[i+1]) {
				return i;
			}
		}
	}
	return -1;
}
}
