package com.examples.dynamicprogramming;

/**
 * Longest common subsequence
 * 
 * Gievn 2 strings, find the longest common subsequence. 
 * 
 * Constraints:  You need to check forward direction only.
 * 
 * Ex:  s = "agdrt"  s1 ="artgd" 
 * 
 *  agd 
 *  art 
 *  rt
 *  gd
 *  
 *  max length is 3
 *
 */
public class LCS {

	static char c[] = null;
	static char c1[] = null;
	
	public static void main(String[] args) {
		
		String s = "bqdrcvefgh";
		String s1 = "abcvdefgh";
		
		c = s.toCharArray();
		c1 = s1.toCharArray();
		
		System.out.println(lcs (0,0));
		System.out.println(dynamicLcs(s,s1));
	}

	/**
	 * Recursion approach
	 * 
	 * @param i
	 * @param j
	 * @return max length of subsequence
	 */
	private static int lcs(int i, int j) {

		// base case
		if (i == c.length || j == c1.length) 
			return 0;
		// if both the characters are equal, continue with next char
		else if (c[i] == c1[j]) {
 			return 1 + lcs (i+1, j+1);
		} else {
			return max(lcs(i+1, j), lcs(i, j+1));
		}
	}

	private static int max(int a, int b) {
		return  (a > b) ? a : b;
	}
	
	/**
	 * Dynamic programming approach: Tabluation approach
	 * 
	 * For any cell - if the row value and column value are equal, 
	 *  a[i][j] = a[i-1][j-1] + 1  - why? 
	 *  
	 *  - this is to check the previous sequence check. if the previous
	 *    element is also matched, you need to add that to the current 
	 *    sequence element
	 *  
	 * For any cell - if the row value and column value are not equal,
	 * 
	 *  a[i][j]  = max (a[i-1][j], a[i][j-1]) - why?
	 *  
	 * 
	 */
	private static int dynamicLcs(String s, String s1) {
		
		int a[][]  = new int[s.length()+1][s1.length()+1];

		for (int i=1; i <= s.length(); i++ ) {
			char c22 = s.charAt(i-1);
			for (int j=1; j <= s1.length(); j++) {
				char c23 = s1.charAt(j-1);
				if (c22 == c23) {
					a[i][j] = a[i-1][j-1] + 1;
				} else {
					a[i][j] = Math.max (a[i-1][j], a[i][j-1]);
				}
			}
		}
		return a[s.length()][s1.length()];
	}
}