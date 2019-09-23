package com.examples.hackerrank;

/**
 * https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 * 
 * Not all the test cases are passing: 
 * 
 * TODO: need to understand more.
 * 
 */
public class ArrayManipulation {

	public static void main(String[] args) {
		int[] temp  = new int[10];
		
		int[][] arr  = {
							{2, 6, 8},
							{3,5,7},
							{1,8,1},
							{5,8,15}
					   };
		
		int max = Integer.MIN_VALUE;
		for (int i =0 ; i< arr.length; i++) {
			for (int j = 0; j < arr[i].length ;) {
				
				int s = arr[i][j];
				int e = arr[i][j+1];
				int k = arr[i][j+2];
								
                while (s <= e ) {
                    temp[s-1]  += k;
                    max = Math.max(max, temp[s-1]); 
                    s++;
                }
                break;
			}
		}
		System.out.println(max);
	}

}
