package com.examples.generalprograms;

import java.util.Arrays;
import java.util.BitSet;

public class FindMissingNumersInIntegerArray2 {

	public static void main(String[] args) {


		int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n", 
                           Arrays.toString(iArray), missing);

        // you can use the BitSet class to set the values to "true" if present, else "false"
        BitSet bitSet = new BitSet(10);
        bitSet.set(4);
        System.out.println(  bitSet.get(10)  + " " +  bitSet.get(4));
        System.out.println("length = "  +  bitSet.length());
        System.out.println("cardinality = "  +  bitSet.cardinality());
	}

	/**
	 * Add the numbers from 1 to 5 (expected sum) 
	 * Add the actual numbers in the array  (actual sum)
	 * subtract actual sum from expected sum 
	 * 
	 * @param numbers
	 * @param totalCount
	 * @return
	 */
	private static int getMissingNumber(int[] numbers, int totalCount) {
		int expectedSum = 0; // totalCount * ((totalCount + 1) / 2); 
		
		for (int i=1; i<= totalCount; i++) { 
			expectedSum += i; 
		} 
		
		System.out.print(expectedSum);
		
		int actualSum = 0; 
		for (int i : numbers) { 
			actualSum += i; 
				
		} 
		return expectedSum - actualSum; 
		}
}
