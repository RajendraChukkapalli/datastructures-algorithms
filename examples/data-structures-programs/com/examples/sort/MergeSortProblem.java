package com.examples.sort;
/**
 * 
 * Reference: https://www.baeldung.com/java-merge-sort
 * 
 * Merge sort algorithm:
 * 
 * 1. Divide the input array using a midpoint
 * 2. Build 2 arrays - 1 left array 2. right array
 * 3. Populate the elements from input array to left and right arrays
 * 4. Do it recursively until elements in both left and right array are less than 2 (base case)
 * 5. do the merge operation
 * 
 * Merge: 
 *
 * 1. Take both left and right array and compare each element and add to the new array
 * 2. When we reach the end of one of the sub-arrays, the rest of the elements from the other array 
 *    are copied into the input array thereby giving us the final sorted array:
 */
public class MergeSortProblem {

	public static void main(String[] args) {
		int[] a = { 5, 1, 6, 2, 3, 4, -1, 200, 35, 99, 18, 10000, 999, 467, 540};
		mergeSort(a, a.length);
		for (int i : a) System.out.print(i + ", ");
	}

	/**
	 * Merge sort - recursion
	 * 
	 * @param a
	 * @param length
	 */
	private static void mergeSort(int[] a, int length) {
		
		if (length < 2) return;
		
		int mid = length / 2;
		int[] left = new int[mid];
		int[] right = new int[length-mid];
		
		for (int i =0; i< mid; i++) {
			left[i] = a[i];
		}
		// initialize mid as we need to fill the right array (with zero index)
		// and from middle of input array.
		for (int i = mid ; i< length ; i++) {
			right[i-mid] = a[i];
		}
		
		mergeSort(left, mid);
		mergeSort(right, length-mid);
		
		merge(a, left, right, mid, length-mid);
	}

	/**
	 * Merge operation
	 * 
	 * @param a  - input array
	 * @param left  - left array
	 * @param right - right array
	 * @param mid - mid point
	 * @param mid2 - (mid point to end) 
	 */
	private static void merge(int[] a, int[] l, int[] r, int left, int right) {
		
		int i = 0; // index for left array
		int j = 0; // index for right array
		int k = 0; // index for input array;
		
		// iterate both left and right and add to input array.
		while (i < left && j < right) {
			if (l[i] < r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		// add left array elements
		while (i < left) {
			a[k++] = l[i++];
		}
		// add right array elements
		while (j < right) {
			a[k++] = r[j++];
		}
	}
}
