package com.examples.datastructures.recursion;

public class FactorialExample {

	public static void main(String[] args) {
		int fact =  4; 
		int output = findFactorial (fact);
		System.out.println(output);
	}

	private static int findFactorial(int fact) {
		if (fact == 1) return 1;
		return fact * findFactorial (fact - 1);
	}
}