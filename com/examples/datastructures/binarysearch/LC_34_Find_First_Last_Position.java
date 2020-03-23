package com.examples.datastructures.binarysearch;

/**
 * LC-34
 * Given an array with sorted integers, find the "start" and "end" position
 * of a given target value.
 * 
 */
public class LC_34_Find_First_Last_Position {

	public static void main(String[] args) {
		int[] result = new int[2];
		int nums[]   = {5,7,7,8,8,10};
		int target  = 8;
		result[0]  = findStartingIndex(nums, target);
		result[1]  = findEndingIndex(nums, target);
		System.out.println("result[0] = " + result[0]  + "  result[1]  = " + result[1]);
	}

	private static int findStartingIndex(int[] nums, int target) {
		int index = -1;
		
		// create the start and end indexes 
		int start = 0;
		int end  = nums.length - 1;
		
		while (start <= end) {
			// get the mid point
			int mid = start + (end-start) / 2;
			// nums[mid] > target means the element is on left side
			if (nums[mid] >= target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			if (nums[mid] == target) {
				index = mid;
			}
		}
		return index;
	}

	private static int findEndingIndex(int[] nums, int target) {
		int index = -1;
		
		// create the start and end indexes 
		int start = 0;
		int end  = nums.length - 1;
		
		while (start <= end) {
			// get the mid point
			int mid = start + (end-start) / 2;
			// nums[mid] > target means the element is on left side
			if (nums[mid] <= target) {
				start = mid + 1;
			} else {
				end =mid - 1;;
			}
			if (nums[mid] == target) {
				index = mid;
			}
		}
		return index;
	}
}
