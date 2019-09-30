package com.examples.hackerrank.problemsolving.datastructures;

/**
 * https://www.hackerrank.com/challenges/arrays-ds/problem
 *
 */
public class ArrayDS {

	public static void main(String[] args) {

		int[] a = { 45, 89, 1, -7, 100, 45 };
		int[] newarr = reverseArray(a);
		for (int b : newarr) {
			System.out.print(b + " ");
		}
	}

	static int[] reverseArray(int[] a) {
		int asize = a.length;
		int bsize = a.length - 1;
		int b[] = new int[asize];
		for (int temp : a) {
			b[bsize] = temp;
			bsize -= 1;
		}
		return b;
	}
}
