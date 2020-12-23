package com.examples.new_test;

/**
 * Given a rotated sorted array, find the pivot
 * @author AdminUser
 *
 */
public class FindPivot {

	public static void main(String[] args) {
		
		int[]  nums = {5,6,7,8,9,0,1,2,3,4};
		int target = 0;
		
		int left = 0;
		int right = nums.length - 1;
		
		while (left < right) {
			
			int mid = left + (right - left)/2;
			
			if (nums[mid] > nums[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		System.out.println(left);
		
		int start = left;
		left = 0;
		right = nums.length - 1;
		
		if (target >= nums[start] && target <= nums[right]) {
			left = start;
		} else {
			right = start;
		}
	}

}
