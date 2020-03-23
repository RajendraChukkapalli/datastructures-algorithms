package com.examples.algorithms.sorting;

import java.util.Arrays;

/**
 * Divide and conquer algorithm like "merge sort" 
 * 
 * 1. Instead of using a mid point, we use a "pivot" 
 * 2. Its a recursive algorithm 
 * 3. Its a in-place algorithm
 * 
 * In fact, java sorting uses 2-pivots // Arrays.sort()
 * 
 * https://www.baeldung.com/java-quicksort
 *
 */
public class QuickSortExample {

	public static void main(String[] args) {
		int intArray[] = { 230, 450, 123, -1, 8, 3, 2, 1, 7, 5, 4, 11, 89, 34, 23, 10};
		quickSort(intArray, 0, intArray.length-1);
		Arrays.stream(intArray).forEach(n -> System.out.print(n + " "));
	}

	private static void quickSort(int[] intArray, int s, int e) {
		if (s < e) {
			int pivot = partition(intArray, s, e);
			quickSort(intArray, s, pivot-1);
			quickSort(intArray, pivot+1, e);
		}
	}

	/*
	 * core logic: 
	 * 
	 * 1. select pivot (end element) => why we need to take end element as pivot?
	 * 2. move all the elements to the left 
	 * 3. put 
	 */
	private static int partition(int[] a, int start, int end) {
		
		int pivot = end;
		int pIndex = start;
		for (int j= 0; j < end-1; j++) {
			if (a[j] <= a[pivot]) {
				swap (a, j, pIndex);
				pIndex += 1;
			}
		}
		swap (a, end, pIndex);
		return pIndex;
	}

	/**
	 * Swap the elements in the array
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	private static void swap(int[] a, int i, int j) {
		 int temp = a[j];
		 a[j] = a[i];
		 a[i] = temp;
	}
}
