package com.examples.algorithms.sorting;

/**
 * 1. Either you can create a new Array and move the position
 * 2. Use the same array and move the element to next position.
 *
 */
public class InsertionSortExample {

	public static void main(String[] args) {
		int intArray[] = { 230, 450, 123, -1, 8, 3, 2, 1, 7, 5, 4, 11, 89, 34, 23, 10 };
		sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}

	private static void sort(int[] intArray) {
		for (int i = 0; i < intArray.length ; i++) {
			// Keep the element in temporary variable
			int temp  = intArray[i];
			int j = i;
			// j should be > 0 else ArrayIndexOutOfBoundsException will happen in the first iteration
			while ( j  > 0 && temp < intArray[j-1]) {
				intArray[j] = intArray[j-1];
				j = j -1;
			}
			intArray[j] = temp;
		}
	}
}
