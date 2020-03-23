package com.examples.leetcode;

/**
 * An array is sorted in ascending order is rotated at some pivot unknown to you.
 * 
 * this is not a direct binary search problem as this is rotated. 
 * 
 * 1. need to find out the pivot
 * 2. based on the pivot, find left and right
 * 3. now find the actual target
 *
 */
public class LC33_Search_In_Sorted_Array {

	public static void main(String[] args) {
		int a[] = {4,5,6,7,0,1,2};
		int t = 0;
		System.out.println(search(a,t));
	}

	private static int search(int[] nums, int target) {
		if (nums == null || nums.length == 0) return -1;
		
		int left = 0;
		int right = nums.length - 1;
		
		while (left < right) {
			int mid = left + (right-left) /2;
			if(nums[mid] > nums[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		
		int start = left;
		left = 0;
		int end = nums.length - 1;
		
		if (target >= nums[start]  && target <= nums[end]) {
			left = start;
		} else {
			right = start;
		}
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			if(nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return -1;
	}

}
