package com.examples.generalprograms;

/**
 *  Rotate array by 5 positions
 */
public class ArrayExample1 {

	public static void main(String[] args) {
		
		Integer intArray[] = new Integer[20]; 
		
		// insert 20 elements into array 
		for (int i=0; i<20; i++) {
			intArray[i] = i;
		}
		// rotate the array left by 5 items 
		rotateArray(intArray, 5); 
		
		for (Integer i : intArray) {
			System.out.print(i + " | ") ;
		}
	}
	
	
	/**
	 * 1. Keep the first element in temp variable
	 * 2. Iterate all the array elements to 1 position left side.
	 * 3. put the temp element to the last
	 * 4. repeat the process
	 * 
	 * o(n2) - complexity as we need to move 1 element by 1 element
	 * 
	 * can this be done in O(1):  but might need an extra space;
	 * 
	 * @param intArray
	 * @param byTimes
	 */
	static void rotateArray(Integer[] intArray, int byTimes) {
		for (int i=0; i< byTimes; i++) {
			int temp = intArray[0];
			for (int j=0; j < intArray.length-1; j++) {
				intArray[j] = intArray[j+1];
			}
			intArray[intArray.length-1] = temp;
		}
	}
}
