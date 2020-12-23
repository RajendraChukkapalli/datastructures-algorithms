package com.examples.new_test;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		
		int[] A = new int[] {1,2,2,3,3,3,3,4,4};
		removeDuplicates(A);
	}

	private static void removeDuplicates(int[] a) {
		
		int t =1 ;
		for (int i=0; i< a.length-1; i++) {
			if(a[i] != a[i+1]) {
				a[t] = a[i+1];
				t++;
			}
		}
		for (int i=0; i < t; i++) {
			System.out.println(a[i]);
		}
	}

}
