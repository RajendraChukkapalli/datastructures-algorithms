package com.examples.algoexpert;

/**
 * Algo-expert:  https://www.algoexpert.io/questions/Two%20Number%20Sum
 * 
 */
public class TwoNumberSum {

	public static void main(String[] args) {
		int[] output = twoNumberSum(new int[]{-21,301,12,4,65,56,210,356,9,-47}, 164);
		for (int item: output) System.out.println(item + " ");
	}
	
	
	public static int[] twoNumberSum(int[] array, int targetSum) {
		for (int i = 0; i < array.length; i++) {
				for (int j =0; j < array.length; j++) {
					if(i == j) continue;
					if ((array[i] + array[j]) ==  targetSum) {
						  return (array[i] > array[j]) ? new int[]{array[j], array[i]} : new int[]{array[i], array[j]};
				 }
			}
		}
		return new int[]{};
	}
}
