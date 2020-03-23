package com.examples.leetcode;

public class LC724_PivotIndex {

	public static void main(String[] args) {
		int nums[] = {1, 7, 3, 6, 5, 6};
		System.out.println(pivotIndex(nums));
	}

	public static int pivotIndex(int[] nums) {

		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			sum  -= nums[i];
			if (sum-temp == 0) {
				return i;
			}
			temp += nums[i];
		}
		return -1;
	}
}
