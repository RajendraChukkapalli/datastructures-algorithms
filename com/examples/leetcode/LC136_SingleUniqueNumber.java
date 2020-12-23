package com.examples.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC136_SingleUniqueNumber {

	public static void main(String[] args) {

		int[] intArray = {2,2,1};
		// System.out.println(findUniqueNumber(intArray));
		System.out.println(findUniqueNumber2(intArray));
		
	}
	
	/**
	 * Using extra space 
	 * 
	 * @param a
	 * @return
	 */
	static int findUniqueNumber(int[] a) {
		
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
	static int findUniqueNumber2(int[] a) {
		
		int result = 0;
		for (int item: a) {
			result ^= item;
			System.out.println(result);
		}
		return result;
	}
}
