package com.examples.algoexpert;

import java.util.Arrays;

/**
 * 3 largest elements from an array.  You can sort and print last 3 elements as below:
 *
 */
public class Find3LargestNumbersFromArray {

	public static void main(String[] args) {

		int[]  input = new int[] {141,-7,-17,1,11,18,541,-2};
		int[]  output = new int[]{Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};


		for (int num:  input) {
			process3Largest(output, num);
		}

		for (int num:  output) {
			System.out.print(num + " ");
		}
	}

	private static void process3Largest(int[] output, int num) {
		if (num > output[2]) {
			shuffle(output, num, 2);
		} else if (num > output[1]) {
			shuffle(output, num, 1);
		} else if (num > output[0]) {
			shuffle(output, num, 0);
		}
	}

	private static void shuffle(int[] output, int num, int outputIndex) {
		for (int i=0; i <= outputIndex; i++ ) {
			if (i == outputIndex) {
				output[i] = num;
			} else {
				output[i] = output[i+1];
			}
		}
	}

	 /**
	  * U can use array.sort and display the last 3 elements
	  *
	  */
	 public static int[] findThreeLargestNumbers(int[] array) {
		int[] output = new int[3];
		Arrays.sort(array);
		for (int i=(array.length-3), j=0; i < array.length; i++, j++) {
			System.out.println(array[i] + "  ");
			output[j] = array[i];
		}
		return output;
	}
}
