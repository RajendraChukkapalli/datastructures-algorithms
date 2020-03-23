package com.examples.test;

import java.util.Arrays;

public class Java8Test {

	public static void main(String[] args) {
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		Arrays.stream(input).filter(n -> n>2).forEach(System.out::print);
	}
}
