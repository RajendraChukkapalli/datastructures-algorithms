package com.examples.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 */
public class LC34_Find_First_Last_Position_Elemenet_In_Array {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,6,6,6,8};
		int target = 6;
		int[] out = findFirstLastPositionOfElementInArray(nums, target);
		Arrays.stream(out).forEach(n -> System.out.println(n));
		
		// call BS solution
		int output = findFirstLastPositionOfElementInArrayUsingBS(nums, target);
		System.out.println(output);
		int output2 = findFirstLastPositionOfElementInArrayUsingBS(nums, target+1) - 1;
		System.out.println(output2);
		
		int output3 = findFirstLastPositionOfElementInArrayBS(nums, target);
		System.out.println(output3);
	}

	/** 
	 * 2-pointer approach. O(n) solution.
	 * 
	 * @param nums
	 * @param t
	 * @return
	 */
	private static int[] findFirstLastPositionOfElementInArray(int[] nums, int t) {
		int[] out = new int[2];
		if (nums == null || nums.length == 0) {
			out[0] = -1;
			out[1] = -1;
			return out;
		} else {
			int i = 0;
			int j = nums.length - 1;
			if (i == j) return new int[] {0,0};
			while (i < j) {
				if (nums[i] == t && nums[j] == t) {
					return new int[]{i,j};
				}
				if (nums[i] != t) i++;
				if (nums[j] != t) j--;
			}
		}
		return new int[]{-1, -1};
	}
	
	/**
	 * Binary search solution  O(long n)
	 * 
	 * 
	 */
	private static int findFirstLastPositionOfElementInArrayUsingBS(int[] nums, int t) { 
		
		int low = 0;
		int first = -1;
		int high = nums.length - 1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2 ;
			
			if (nums[mid] >= t) {
				high = mid - 1;
				first = mid ;
			} else {
				low = mid + 1;
			}
		}
		return first;
	}
	
	/**
	 * another variation of binary search
	 */
	private static int findFirstLastPositionOfElementInArrayBS(int[] nums, int t) { 
		
		int index = -1;
		int low = 0;
		int high = nums.length - 1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2 ;
			
			if (nums[mid] <= t) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			if (nums[mid] == t) index = mid;
		}
		return index;
	}
	
	

}
