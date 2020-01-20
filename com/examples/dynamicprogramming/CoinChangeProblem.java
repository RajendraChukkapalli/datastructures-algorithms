package com.examples.dynamicprogramming;

public class CoinChangeProblem {

	
	public static int[] coins = {1,2,3,4};
	public static int amount  = 8;
	
	public static void main(String[] args) {
		// recursion
		System.out.println(combo(12, 0, 0));
		// dynamic programming
		System.out.println(dpsolution(12, coins));
		
		// dynamic programming solution 2 (using 2D array)
		System.out.println(dpsolution2(12));
	}
	
	/**
	 * Using 2D array
	 * 
	 * @param i
	 * @param coins2
	 * @return
	 */
	private static int dpsolution2(int amount) {
		
		int[] coins2 =  {0,1,2,3,4};
		
		int[][] combinations = new int[coins2.length][amount+1];
		
		for (int i=0; i < coins2.length; i++) {
			for (int j= 0; j < amount+1; j++ ) {
				
				// base condition
				if (i == 0 && j == 0) {
					combinations[i][j] = 1;
					continue;
				}
				// fill the first row with ZERO values
				if (i == 0 && j >= 1) {
					combinations[i][j] = 0;
					continue;
				}
			
				if (i > j) {
					combinations[i][j] = combinations[i-1][j];
				} else {
					combinations[i][j]  = combinations[i-1][j] + combinations[i][j-i];
				}
			}
		}
		return combinations[coins2.length-1][amount];	
	}

	/**
	 * Using single dimensional array
	 * 
	 * @return number of combinations
	 */
	private static int dpsolution(int amount, int[] coins) {
		
		int[] combinations = new int[amount+1];
		// initialize to "1" as the amount cannot be zero
		combinations[0] = 1; 
		
		for (int i=0; i < coins.length; i++) {
			for (int j = 1; j < combinations.length; j++) {
				if (j >= coins[i]) { 
					combinations[j] = combinations[j] + combinations[j-coins[i]];
				}
			}
		}
		return combinations[amount];
	}

	/**
	 * Recursion example.
	 * 
	 * @param amount
	 * @param coin1
	 * @return
	 */
	private static int combo(int amount, int coin1, int count) {
		
		// base case
		if (amount == 0 ) return 1;
		// base case
		if (amount <  0 ) return 0;
		
		int nCombos = 0;
		for (int coin =coin1; coin < coins.length; coin++) {
			nCombos += combo(amount - coins[coin], coin, count++);
		}
		return nCombos;
	}
}
