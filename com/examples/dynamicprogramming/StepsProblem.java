package com.examples.dynamicprogramming;

/**
 * Reference:  https://www.youtube.com/watch?v=5o-kdjv7FD0&t=929s
 * 
 * 1. Given N number of steps, how many ways you can climb the steps
 */
public class StepsProblem {

	public static void main(String[] args) {
		
		System.out.println(numberOfWays(6));
		System.out.println(numberOfWays2(6));
		System.out.println(climbStairs(6));


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

		// base case
		if (n == 0 || n == 1) {
			return 1;
		// base case
		} else if (n ==2) {
			return 2;
		} else {
			return numberOfWays(n-1) + numberOfWays(n-2) + + numberOfWays(n-3);
		}
	}

	/**
	 * Memoize - store the sub-problem results and return them.
	 * 
	 * @param n
	 * @return
	 */
	private static int numberOfWays2(int n) {
		int memo[] = new int[n + 1];
		return  numberOfWaysHelper(n, memo);
	}
	
	private static int numberOfWaysHelper(int n, int[] memo) {

		if (n == 0 || n == 1) return 1;

		memo[0] = 1;
		memo[1] = 1;
		memo[2] = 2;

		if (memo[n] > 0) {
			return memo[n];
		}

		// cache the memo
		memo[n] = numberOfWaysHelper(n - 1, memo) + numberOfWaysHelper(n - 2, memo) + numberOfWaysHelper(n - 3, memo);

		return memo[n];
	}
	

	public static int climbStairs(int n) {
    /*
      In programming we all know we index off of 0. This is why
      we create an array of size n + 1. It is so we can just return
      dp[n] at the end instead of fumbling with dp[n - 1].
      If n = 4 we will get an array like this if we just did "new int[n];":
      [0, 0, 0, 0]
       0  1  2  3
      If we instead do "new int[n + 1" we have:
      [0, 0, 0, 0, 0]
       0  1  2  3  4
       And now we can be literal in how we access the nth subproblem
    */
    int[] dp = new int[n + 1];

    /*
      n = 0, the answer is 1. We can only take no steps.
    */
    dp[0] = 1;

    /*
      n = 1, the answer is 1. We can only take 1 step.
    */
    dp[1] = 1;

    dp[2] = 2;

    /*
      The answer to the ith subproblem is the sum between the answer
      to the subproblems of climbing i - 1 stairs and i - 2 stairs
    */
	for (int i = 3; i <= n; i++) {
		dp[i] = dp[i - 1] + dp[i - 2]+ dp[i-3];
	}

    /*
      This is what we want and built to the while way. The answer for
      the total unique ways to climb n steps when we can either take a
      1 step or 2 step
    */
    return dp[n];
	}
}
