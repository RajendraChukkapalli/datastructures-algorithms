package com.examples.new_test;

import java.util.Arrays;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		
		int[] A = new int[] {10,40,50};
		int[] B = new int[] {15,20,30,80}; 
		merge2Arrays(A, B);
		int[]  AB = mergeSortedArrays(A,B);
		Arrays.stream(AB).forEach(a -> System.out.print(a + " "));
	}

	private static void merge2Arrays(int[] a, int[] b) {
		int aLen = a.length;
		int bLen = b.length;
		int aIndex = 0;
		int bIndex = 0;
		int mIndex = 0;
		int[] m = new int[a.length + b.length];
		while (aIndex < a.length && bIndex < b.length ) {
			if (a[aIndex] < b[bIndex]) {
				m[mIndex++] = a[aIndex++];
			} else {
				m[mIndex++] = b[bIndex++];
			}
		}
		if (aIndex < a.length) {
			for (int i=aIndex; i < a.length; i++) {
				m[mIndex++] = a[aIndex++];
			}
		} else if (bIndex < b.length ) {
			for (int i=bIndex; i < b.length; i++) {
				m[mIndex++] = b[bIndex++];
			}
		}
		for (int mItem: m) {
			System.out.println(mItem);
		}
	}
	
	public static int[] mergeSortedArrays(int[] myArray, int[] alicesArray) {
	    int[] mergedArray = Arrays.copyOf(myArray, myArray.length + alicesArray.length);
	    System.arraycopy(alicesArray, 0, mergedArray, myArray.length, alicesArray.length);
	    Arrays.sort(mergedArray);
	    return mergedArray;
	}

}
