package com.examples.leetcode;

import java.util.*;

public class LC54_Spiral_Matrix {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		// define boundaries.
		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;

		int maxElements = matrix.length * matrix[0].length;

		// result
		List<Integer> result = new ArrayList<>();

		while (result.size() < maxElements) {

			// start the top row
			// why result.size() -> checking the boundary condition
			for (int i = left; i <= right && result.size() < maxElements; i++) {
				result.add(matrix[top][i]);
			}
			top++;

			// start the right row
			for (int i = top; i <= bottom && result.size() < maxElements; i++) {
				result.add(matrix[i][right]);
			}
			right--;

			// start bottom row
			for (int i = right; i >= left && result.size() < maxElements; i--) {
				result.add(matrix[bottom][i]);
			}
			bottom--;
			// start left
			for (int i = bottom; i >= top && result.size() < maxElements; i--) {
				result.add(matrix[i][left]);
			}
			left++;
		}
		result.forEach(n -> System.out.println(n + " "));
	}
}
