package com.examples.sort;


/**
 * It is a 2-dimensional array. For every column, need to iterate the complete 
 * row and move the elements. 
 * 
 * O(n * n)  = o(n2) time complexity space complexity - O(1) space
 * 
 */
public class BubbleSortExample {

	public static void main(String[] args) {
		int intArray[] = { 230, 450, 123, -1, 8, 3, 2, 1, 7, 5, 4, 11, 89, 34, 23, 10};
		sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
	         System.out.print(intArray[i] + " ");
	     }
	}

	/**
	 * For every element in the outer array, iterate the inner array (same array) 
	 * 
	 * @param intArray
	 */
	private static void sort(int[] intArray) {
		for (int i = 0; i < intArray.length-1; i++) {
			for (int j = 0; j < intArray.length-1 ; j++ ) {
				if (intArray[j] > intArray[j+1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = temp; 	
				}
			}
		}
	}
}
