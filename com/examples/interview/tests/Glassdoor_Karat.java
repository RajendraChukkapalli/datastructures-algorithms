package com.examples.interview.tests;

/*

You are designing a new point and click adventure game. In order to appeal to a broader set of players, you decide to include some logic puzzles in addition to a wide variety of inventory-based puzzles.The first puzzle you settle on is "sub-Sudoku".

Your job is to write a function that, given an NxN grid, returns true if  every row and column contains the numbers 1..N

The grid can contain any integer, not just 1..N, and not just positive.

Examples:

[[1, 2, 3],
 [2, 3, 1],
 [3, 1, 2]]         -> True

[[1, 2, 3],
 [1, 2, 3],
 [1, 2, 3]]        -> False

[[1000, -1000, 6],
 [   2,     3, 1],
 [   3,     1, 2]] -> False

 }
*/

public class Glassdoor_Karat {

	public static void main(String[] args) {
		
		int[][] grid1 = {{1,2,3},{2,3,1},{3,1,2}};
	    int[][] grid2 = {{1,2,3},{1,2,3},{1,2,3}};
	    int[][] grid3 = {{1000,-1000,6},{2,3,1},{3,1,2}};
	    int[][] grid4 = {{1,1,1},{1,1,1},{1,1,1}};

		System.out.println(validGrid(grid1));
		System.out.println(validGrid(grid2));
		System.out.println(validGrid(grid3));
		System.out.println(validGrid(grid4));

	}
	private static boolean validGrid(int[][] grid) {
		int k = grid.length;
	     for (int i=0; i< k; i++) {
	      for (int j=0; j< k; j++) {
	    	  int x = grid[i][j]; 
	    	  // for every row element, check the column
	    	  // if the element is present > 1
	    	  // if the element does not present
	    	  boolean found = true;
	    	  for (int n=0; n < k; n++) {
	    		  if (grid[i][n] == x) {
	    			  found = true;
	    		  } else {
	    			  found = false;
	    		  }
	    	  }
	    	  if (!found) {
	    		  return false;
	    	  }
	      }
	    }
	    return true;
	  }
}
