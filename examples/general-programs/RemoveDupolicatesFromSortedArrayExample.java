package com.examples.generalprograms;

/**
 * Remove duplicates from sorted array
 * 
 * [1,2,2,2,3,5,6,7,7,8,9,9,99.100,100]
 * 
 * to 
 * 
 * [1,2,3,5,6,7,8,9,99.100]
 * 
 */
public class RemoveDupolicatesFromSortedArrayExample {

	public static void main(String[] args) {

		Integer[] intArray =  new Integer[15];
		
		intArray[0] = 1;
		intArray[1] = 1;
		intArray[2] = 2;
		intArray[3] = 2;
		intArray[4] = 2;
		intArray[5] = 3;
		intArray[6] = 6;
		intArray[7] = 7;
		intArray[8] = 7;
		intArray[9] = 8;
		intArray[10] = 9;
		intArray[11] = 9;
		intArray[12] = 9;
		intArray[13] = 12;
		intArray[14] = 12;
		
		int i = 0;
		int j = i+1;
		boolean inner = false; 
		while (i <= intArray.length) {
			
			if (j == intArray.length - 1 ) { 
				for (int i1 = i+1; i < intArray.length -1; i1++) {
					intArray[i1] = null;
					if (i1 == intArray.length -1 ) {
						inner = true;
						break; 
					}
				}
			}
			if (inner) break;
			// check for 1st, 2nd and 3rd numbers 
			// if 1st and 2nd are equal and 3rd is not equal, move 3rd to 2nd
			if ((intArray[i] == intArray[j]) && 
					(intArray[j] != intArray[j+1]))  {
				i = i + 1;
				j = j + 1;
				intArray[i] = intArray[j];
				// if the numbers are not equal, assig the 
				// number and reset the index in array
				j = i+1; // resetting the index.
			} else {
				j = j + 1;
			}
		}
		
		int temp = 0;
		StringBuffer buffer = new StringBuffer();
		while (intArray[temp] != null ) {
			buffer.append("\"").append(intArray[temp]).append("\","); temp += 1;
 		}
		System.out.println(buffer.toString().substring(0, buffer.length() - 1));
	}
}