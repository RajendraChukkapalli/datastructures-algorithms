package com.examples.generalprograms;

/** 
 *     1  2  3         4  5  6 
 *     2  3  6    *   -1  0  2 
 *     4  5  2        -2  9  1
 */
public class MultiplyArrayProblem {

	public static void main(String[] args) {

		// in 2-dimensional array
		int intArray [] [] = {{1,2,3,4}, {5,6,7,8}, {9,3,2,1}, {2,4,7,2}}; 
		for (int i = 0 ; i < intArray.length ; i ++  ) {
			for (int j = 0; j < intArray[i].length; j++ ) { 
				System.out.print(intArray[i][j] + ",  ");
			}
		}
		// find the diagnoal difference
		calculateDiagonalDifference(intArray); 
		
		// multiply array 
		multiply(intArray); 
	}

	// Here the problem is multiplied by "1"
	private static void multiply(int[][] intArray) {
		int sum = 1;
		int k = 0;
		Integer[][] outArray = new Integer[4][4];;
		// multiply array
		for (int i = 0 ; i < intArray.length ; i ++  ) {
			for (int j = 0; j < intArray[i].length; j++ ) { 
				sum = sum * intArray[i][j];
				k = j;
			}
			outArray[i][k] = sum;
		}
		// print array
		for (int i = 0 ; i < intArray.length ; i ++  ) {
			for (int j = 0; j < intArray[i].length; j++ ) { 
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void calculateDiagonalDifference(int[][] intArray) {

		int sum1 =0; int sum2  =  0;
		int temp  =  0;
		int temp1 = intArray.length-1;
		
		for (int i = 0 ; i < intArray.length ; i ++  ) {
			for (int j = 0; j < intArray[i].length; j++ ) { 
				if (j == temp && (i == j)) {
					sum1 += intArray[i][j];
					temp += 1;
				}
				if (j == temp1) {
					sum2 += intArray[i][j];
					temp1 -= 1;
				}
			}
		}
		System.out.print("sum1 = " + sum1  + "  sum2 =" + sum2);
	}
}