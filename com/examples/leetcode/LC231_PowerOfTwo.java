package com.examples.leetcode;

/**
 * https://leetcode.com/problems/power-of-two/
 * 
 * 1. one way to check is keep dividing it by 2 until it is euqal to 2 or less.
 *
 */
public class LC231_PowerOfTwo {

	public static void main(String[] args) {
		
		int num = 3;
		
		while (num % 2 == 0) {
			num = num / 2;
		}
		System.out.println(num == 1);
	}
}
