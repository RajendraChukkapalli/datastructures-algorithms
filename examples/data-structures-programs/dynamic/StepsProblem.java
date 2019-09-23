package com.examples.dynamicprogramming;

/**
 * Reference:  https://www.youtube.com/watch?v=5o-kdjv7FD0&t=929s
 * 
 * 1. Given N number of steps, how many ways you can climb the steps
 * 2. Recursive with "memoization"
 * 3. 
 */
public class StepsProblem {

	public static void main(String[] args) {
		
		System.out.println(numberOfWays(7));

		System.out.println(numberOfWays2(7));
		
		int[] steps = {1,2};
		int count = numberOfWaysWithAGivenSet(7, 0,steps);
		System.out.println(count);
		
		System.out.println(numberOfWaysWithAGivenSetRecursive(7));
		
	}
	
	/**
	 * Recursive solution: 
	 * Assumption "0" steps is "1"
	 * 
	 * {[0,1,2,3,4]
	 *  [0,2,3,4]
	 *  [0,2,4]
	 *  [0,1,3,4]
	 *  [0,1,2,4]}
	 * 
	 * @param n
	 * @return 
	 */
	private static int numberOfWays(int n) {
		
		// if we include the following, 
		// {[1,2,3,4][2,3,4][1,3,4]}
		
		// if (n == 0) return 0; 
		// base case
		if (n == 0 || n == 1) {
			return 1; 
		} else {
			return numberOfWays(n-1) + numberOfWays(n-2);
		}
	}
	
	/**
	 * Memoize - store the sub-problem results and return them.
	 * 
	 * @param n
	 * @return
	 */
	private static int numberOfWays2(int n) {
		return  numberOfWaysHelper(n);
	}
	
	private static int numberOfWaysHelper(int n) {
		if (n == 0 || n == 1) return 1;
		int[] a = new int[n+1];
		
		a[0] = 1;
		a[1] = 1;
		
		// fill the array with all the combinations
		for (int i = 2; i <= n; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		return a[n];
	}
	
	
	/**
	 * TODO
	 * 
	 * Given a set of {1,2}, calculate the number of ways to climb.
	 * 
	 * @param n
	 * @param index
	 * @param steps
	 * @return
	 */
	private static int numberOfWaysWithAGivenSet(int n, int index, int[] steps) {
		if (n == 0 || n == 1 ) return 1;
		int count = 0;
		for (int m = 0; m < steps.length; m++ ) {
			count += numberOfWaysWithAGivenSet(n-steps[m], m, steps);
		}
		return count;
	}
	
	/**
	 * Recursion solution with a set
	 * 
	 * @param n
	 */
	private static int  numberOfWaysWithAGivenSetRecursive(int n) { 
		
		if (n == 0 ) return 1;
		
		int total = 0;
		
		if (n >=0 ) {
		total += numberOfWaysWithAGivenSetRecursive(n-1) + 
				 numberOfWaysWithAGivenSetRecursive(n-2) +
				 numberOfWaysWithAGivenSetRecursive (n-5);
		}
		
		return total;
		}
}
