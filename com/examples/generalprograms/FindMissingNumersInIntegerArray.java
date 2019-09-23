package com.examples.generalprograms;


/*
 * Java Program to find missing numbers in an integer
 * array with duplicates. Array may contains more
 * than one duplicates.
 * 
 * input: {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
 * output: 4, 6, 8
 */
public class FindMissingNumersInIntegerArray {

	public static void main(String[] args) {
		
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		int[] register = new int[input.length];
		
		/**
		 * register is initialized to all "0" 
		 * for each value in the input array, set "1" 
		 * iterate and display the positions which have "0" (missing elements)
		 */
		for (int value :  input) {
			// its like a bit set "1" or "0"  
			// if the input has value, set the value as "1" in register array
			register[value]  = 1;   
		}
			
		// print the missing elements from the register array which have "0" set
		for (int i=1; i < register.length; i++) {
			// its like a bit set "1" or "0"  
			// if the input has value, set the value as "1" in register array
			if (register[i]  == 0) {
				System.out.print(i);
			}
		}
	}
}
