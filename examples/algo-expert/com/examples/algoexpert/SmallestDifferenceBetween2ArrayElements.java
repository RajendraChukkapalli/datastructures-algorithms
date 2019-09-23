package com.examples.algoexpert;

import java.util.Arrays;

/**
 * Given 2 arrays. find 1 element from array1 and 1 element from array2
 * whose difference is nearest to zero
 *
 * Return the elements
 *
 */
public class SmallestDifferenceBetween2ArrayElements {

	public static void main(String[] args) {

		int[] array1 = {-1, 3,5,10, 20};
		int[] array2 = {15,17, 134,135,26};
		int[] array3 = smallestDifference(array1, array2);
		for (int item : array3) System.out.print(item + " ");
	}

  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

	  	// 1. sort both the arrays
		// 2. compare and find the diff
	    // O(n2) complexity and O(1) space

		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);

		int minDiff = Integer.MAX_VALUE;
		int diff = 0;

		int[] pair = new int[2];
		for (int i=0; i < arrayOne.length; i++) {
			for (int j=0; j < arrayTwo.length; j++) {
				if (arrayTwo[j] > arrayOne[i]) {
						diff = arrayTwo[j] - arrayOne[i];
				} else if (arrayOne[i] > arrayTwo[j]) {
						diff = arrayOne[i] - arrayTwo[j];
				} else {
					pair[0] = arrayOne[i];
					pair[1] = arrayTwo[j];
					return pair;
				}
				// System.out.println("arrayOne[i]  = "  + arrayOne[i]  + "  " +  "arrayTwo[j]  - "  + arrayTwo[j] + "  diff - " +  (arrayTwo[j]  -  arrayOne[i]));
				if (diff < minDiff) {
					  minDiff = diff;
					  pair[0] = arrayOne[i];
					  pair[1] = arrayTwo[j];
				}
			}
		}
		return pair;
  	}
}
