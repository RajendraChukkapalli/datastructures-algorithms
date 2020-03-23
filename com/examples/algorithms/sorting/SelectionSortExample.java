package com.examples.algorithms.sorting;


/**
 * Take the minimum value (assume first element)
 * Continue till the last element and find out whether any value is less than the minimum value
 * if so, swap the element with the element 
 * continue with second element (assume it as minimum value)
 * 
 */
public class SelectionSortExample {

	public static void main(String[] args) {
		int intArray[] = { 8, 3, 2, 1, 7, 5, 4, 11, 89, 34, 23, 10, 2, -1};
		sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
	         System.out.print(intArray[i] + " ");
	      }
	}

	private static int[] sort(int[] intArray) {

		int sortedArray[] = new int[intArray.length];
		
		for (int i = 0; i < intArray.length; i++) {
			int minimum = i; 
			for (int j = i + 1; j < intArray.length ; j++) {
				// iterate the array from (i+1) and find the minimum element
				if (intArray[j] < intArray[minimum]) 
				{
					minimum = j;
				}
			}
			// once the minimum element is found, the swap the minimum element with element at "i".
			int temp  =  intArray[minimum];
			intArray[minimum] = intArray[i];
			intArray[i] = temp;
		}
		return sortedArray;
	}
}
