package com.examples.subsets_permutations_combinations;

import java.util.*;

public class LC78_Subsets {

	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,1};
		List<List<Integer>> result = subsets(nums);
		System.out.println("result  ===> " + result);
		System.out.println("result.size() ===> " + result.size());
	}

	
	public static List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, 0);
	    return list;
	}

	private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
	    list.add(new ArrayList<>(tempList));
	    for(int i = start; i < nums.length; i++){
	    	if(i > start && nums[i] == nums[i-1]) continue; // remove duplicates
	        tempList.add(nums[i]);
	        backtrack(list, tempList, nums, i + 1);
	        tempList.remove(tempList.size() - 1);
	    }
	}

}
