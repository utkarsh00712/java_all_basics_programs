package Insertion;

import java.util.ArrayList;

public class Main {
	
	    public ArrayList<Integer> twoSum(int[] arr, int target) {

	        ArrayList<Integer> result = new ArrayList<>();

	        int left = 0, right = arr.length - 1;

	        while(left < right) {
	            int sum = arr[left] + arr[right];

	            if(sum == target) {
	                // return indices, NOT values
	                result.add(left);
	                result.add(right);
	                return result;
	            }
	            else if(sum < target) {
	                left++;
	            }
	            else {
	                right--;
	            }
	        }

	        result.add(-1);
	        result.add(-1);
	        return result;
	    }
	}

