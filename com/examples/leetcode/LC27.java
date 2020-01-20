package com.examples.leetcode;

public class LC27 {

	public static void main(String[] args) {
		
		int nums[] = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(nums, 2));

	}
	
	  public static int removeElement(int[] nums, int val) {
	        
	        int count = 0;
	        if (nums == null) return 0;
	        
	        int i = 0;
	        int j = nums.length;
	        
	        while (i < j) {
	            
	            int start = nums[i]; 
	            int end   = nums[j-1];
	            
	            if (end == val) {
	            	j--;
	            	count ++;
	            	continue;
	            }
	            
	            if (start == val && end != val) { 
	                int temp = end; 
	                nums[--j] = val;
	                nums[i++] = temp;
	                count ++;
	                continue;
	            } 
	            i++;
	        }
			return nums.length-count;
	        
	    }

}
