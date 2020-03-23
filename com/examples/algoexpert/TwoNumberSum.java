package com.examples.algoexpert;

import java.util.Arrays;

/**
 * Algo-expert:  https://www.algoexpert.io/questions/Two%20Number%20Sum
 * 
 */
public class TwoNumberSum {

	public static void main(String[] args) {
		int[] output = twoSum(new int[]{3,2,4}, 6);
		for (int item: output) System.out.println(item + " ");
	}
	
	
	public static int[] twoNumberSum(int[] array, int targetSum) {
		for (int i = 0; i < array.length; i++) {
				for (int j =0; j < array.length; j++) {
					if(i == j) continue;
					if ((array[i] + array[j]) ==  targetSum) {
						  return (array[i] > array[j]) ? new int[]{array[j], array[i]} : new int[]{array[i], array[j]};
				 }
			}
		}
		return new int[]{};
	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        
	        Arrays.sort(nums);
	        
	        int i = 0;
	        int j = nums.length - 1;
	        int currentSum = 0;
	        
	        while (i  < j) {
	            currentSum = nums[i] + nums[j];
	            if (currentSum == target) {
	                return new int[] {i,j};
	            } else if (currentSum < target) {
	                i++;
	            } else if (currentSum > target) {
	                j--;
	            }
	        }
	        return new int[] {0,0};
	    }
}
