package com.examples.leetcode;

public class LC11_Container_With_Most_Water {

	public static void main(String[] args) {
		int[] height = new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
	
    public static int maxArea(int[] height) {
        int max = height[0]; 
        for (int i=0; i< height.length; i++) {
            for (int j=i+1; j < height.length ; j++) {
            	int min = Math.min(height[i], height[j]);
                max = Math.max(min * (j-i), max);
            }
        }
        return max;
    }
}