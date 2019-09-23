package com.examples.dynamicprogramming;

/**
 * 0/1 Knapsack problem (maximize weights)
 * 
 * Given certain values and weights, how do you find the items from the set
 * that sum of their values is maximum but their weight is less than
 * or equal weight. 
 * Also you need to pick only one value from each item.
 * 
 */
public class KanpsackProblem {

	public static void main(String[] args) {
		
		int w = 7;
		int[] values = {1,4,5,7};
		int[] weights = {1,3,4,5};
				
		System.out.println(knapsack(w,values,weights));
	}

	/**
	 * Dynamic programming approach
	 * 
	 * @param w
	 * @param values
	 * @param weights
	 */
	private static int knapsack(int w, int[] values, int[] weights) {
				
		int[][] knap = new int[weights.length+1][w+1];
		
		for (int i=1; i <= weights.length; i++) {
			for (int j=1; j <= w; j++) {
				// if the weights value is greater than weight 
				// copy the value from the above cell knap[i][j-1]
				if (weights[i-1] > j) {
					knap[i][j] = knap[i][j-1];
				} else {
					// max value is calculated by (including the item, 
					// excludng the item)
					// including the item means we need to add the corresponding
					// value + balance (j-weights[i-1])
					knap[i][j] = Math.max(values[i-1] + 
										  knap[i-1][j-weights[i-1]], knap[i-1][j]);
				}
			}
		}
		return knap[weights.length][w];
	}

}
