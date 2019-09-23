package com.examples.generalprograms;

/**
 * Given an array of integers, find the second highest integer
 * 
 * Find the 4th max ??? 
 *
 */
public class FindSecondMaxNumber {

	public static void main(String[] args) {
	int[] intArray = {10,23,45,67,89,34,23,9,100,102,172,7,172,1000,-1};
	int max = -1;
	int secondMax = 0;
	for (int intNum  : intArray) { 
		if (intNum > max )  { 
			secondMax = max;
			max = intNum; 
		} 
	}
	System.out.println (max);
	System.out.println (secondMax);
	}
}
