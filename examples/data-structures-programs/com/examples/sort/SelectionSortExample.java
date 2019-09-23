package com.examples.sort;


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
		int minimum = 0; 
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = i + 1; j < intArray.length ; j++) {
				if (intArray[j] < intArray[minimum]) 
				{
					minimum = j;
				}
			}
			int temp  =  intArray[minimum];
			intArray[minimum] = intArray[i];
			intArray[i] = temp;
			minimum= i + 1;
		}
		return sortedArray;
	}
}
