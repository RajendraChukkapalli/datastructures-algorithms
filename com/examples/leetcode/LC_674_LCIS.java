package com.examples.leetcode;

/**
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/
 *
 */
public class LC_674_LCIS {

	public static void main(String[] args) {
		
		int[] nums = {1,3,5,4,7};
		System.out.println(findLengthOfLCIS(nums));

	}
	
	 public static int findLengthOfLCIS(int[] nums) {
	        
	        if (nums == null || nums.length == 0) return 0;
	        
	        int size = 1;
	        int last = nums[0];
	        int max  = 1;
	        for (int i=1; i < nums.length; i++) {
	            if (nums[i] > last) {
	                size += 1;
	                max = Math.max(size, max);
	       
	            } else {
	                size = 1;
	            }
	            last = nums[i];
	        }
	        return max;
	    }

}
