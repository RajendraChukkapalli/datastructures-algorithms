package com.examples.leetcode;

/**
 * https://www.youtube.com/watch?v=vq8Ab-pj2R4
 *
 */
public class LC122 {

	public static void main(String[] args) {
	  int[] intArray = {1,2,3,4,5};
	  System.out.println(maxProfits(intArray));
	}

	private static int maxProfits(int[] intArray) {
		int profit = 0;
		for (int i=0; i <  intArray.length - 1; i++) {
			if (intArray[i+1] - intArray[i] > 0) {
				profit += (intArray[i+1] - intArray[i]);
			}
		}
		return profit;
	}
}
