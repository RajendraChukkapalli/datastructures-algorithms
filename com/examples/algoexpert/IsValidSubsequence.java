package com.examples.algoexpert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsValidSubsequence {

	public static void main(String[] args) {

		int array[] = { 5, 1, 22, 25, 6, -1, 8, 10 };
		int sequnce[] = { 5, 1, 22, 22, 25, 6, -1, 8, 10 };

		List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
		List<Integer> sequnceList = Arrays.stream(sequnce).boxed().collect(Collectors.toList());

		System.out.println(isValidSubsequence(arrayList, sequnceList));
	}

	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		boolean[] boolArray = new boolean[sequence.size()];
		for (int i = 0; i < sequence.size(); i++) {
			if (array.contains(sequence.get(i))) {
				if (boolArray[i]) {
					return false;
				}
				boolArray[i] = true;
			}
		}
		for (boolean b : boolArray) {
			if (!b) {
				return false;
			}
		}
		return true;
	}
}
