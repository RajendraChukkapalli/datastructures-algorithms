package com.examples.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC78_Subsets {

	public static void main(String[] args) {
		int nums[] = {1,2,3};
		List<List<Integer>> result = new ArrayList<>();
		subsets(nums, 0, new ArrayList<Integer>(), result );
		System.out.println(result);
	}

	private static void subsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
		
		// add the current set to result
		result.add(new ArrayList<Integer>(current));
		
		// loop the array and start generating the sets
		for (int i = index; i < nums.length; i++) {
			current.add(nums[i]);
			subsets(nums, i+1, current, result);
			current.remove(current.size() - 1);
		}
	}
}
