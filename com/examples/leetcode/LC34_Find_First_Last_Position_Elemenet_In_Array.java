package com.examples.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 */
public class LC34_Find_First_Last_Position_Elemenet_In_Array {

	public static void main(String[] args) {
		int[] nums = {1};
		int target = 6;
		int[] out = findFirstLastPositionOfElementInArray(nums, target);
		Arrays.stream(out).forEach(n -> System.out.println(n));
	}

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

}
