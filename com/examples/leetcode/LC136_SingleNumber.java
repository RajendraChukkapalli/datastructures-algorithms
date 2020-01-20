package com.examples.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC136_SingleNumber {

	public static void main(String[] args) {

		int[] intArray = {2,2,1};
		System.out.println(findUnuqieNumber(intArray));
		System.out.println(findUnuqieNumber2(intArray));
		
	}
	
	/**
	 * Using extra space 
	 * 
	 * @param a
	 * @return
	 */
	static int findUnuqieNumber(int[] a) {
		
		Set<Integer> uniqueSet = new HashSet<>();
		for (int item: a) {
			if (!uniqueSet.contains(item)) {
				uniqueSet.add(item);
			} else {
				uniqueSet.remove(item);
			}
		}
		
		for (int i: uniqueSet) {
			return i;
		}
		return -1;
	}
	
	/**
	 * Without using extra space 
	 * 
	 * @param a
	 * @return
	 */
	static int findUnuqieNumber2(int[] a) {
		
		int result = 0;
		for (int item: a) {
			result ^= item;
		}
		return result;
	}
}
