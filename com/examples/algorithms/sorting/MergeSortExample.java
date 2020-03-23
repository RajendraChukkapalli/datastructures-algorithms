package com.examples.algorithms.sorting;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * This is divide and conquer algorithm. 
 * 
 * 1. split the array into 2 halves until you have only 1 element in each array.
 * 
 * 
 * 2. Difference between merge sort and quick sort ?
 *    - merge sort needs extra space
 *    - quick sort is in-place sort
 */
public class MergeSortExample {

	public static void main(String[] args) {
		int intArray[] = { 230, 450, 123, -1, 8, 3, 2, 1, 7, 5, 4, 11, 89, 34, 23, 10};
		int len = intArray.length;
		mergeSort(intArray, len);
		Arrays.stream(intArray).forEach(n -> System.out.print(n + " "));
		// why the following does not work. it just display object
		Stream.of(intArray).forEach(n -> System.out.print(n + " "));
	}

	/**
	 * Take a m
	 * @param len 
	 */
	private static void mergeSort(int[] intArray, int len) {
		// base case
		if (len < 2) {
			return;
		}
		int mid = intArray.length / 2;
		int left[] = new int[mid];
		int right[] = new int[len-mid];
		// fill the left array
		for (int i=0; i<mid; i++) {
			left[i] = intArray[i];
		}
		// fill the right array
		for (int i=mid; i<len; i++) {
			right[i-mid] = intArray[i];
		}
		mergeSort(left, mid);
		mergeSort(right, len-mid);
		// once both the lists are merged, then merge both the lists into "intArray"
		merge(left, right, intArray);
	}

	private static void merge(int[] left, int[] right, int[] intArray) {

		int leftLen = left.length;
		int rightLen = right.length;
		
		int i = 0, j = 0, k = 0;
		// check the condition "&&" means both the left and right arrays 
		// should be less than their lengths. one of the array might exhaust before another.
		while (i < leftLen && j < rightLen) {
			if (left[i] <= right[j]) {
				intArray[k++] = left[i++];
			} else {
				intArray[k++] = right[j++];
			}
		}
		// if left is exhausted, copy all the elements from left array into "intArray"
		while (i < leftLen) {
			intArray[k++] = left[i++];
		}
		// if right is exhausted, copy all the elements from right array into "intArray"
		while (j < rightLen) {
			intArray[k++] = right[j++];
		}
	}

}
