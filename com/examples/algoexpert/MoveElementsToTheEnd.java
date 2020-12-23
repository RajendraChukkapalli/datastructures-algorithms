package com.examples.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class MoveElementsToTheEnd {

	public static void main(String[] args) {
		
		List<Integer> input = new ArrayList<>();
		input.add(2);
		input.add(-7);
		input.add(-17);
		input.add(2);
		input.add(2);
		input.add(18);
		input.add(541);
		input.add(2);
		
		List<Integer> output = moveElementsToTheEnd(input, 2);
		output.forEach(n -> System.out.print(n + " "));
	}

	private static List<Integer> moveElementsToTheEnd(List<Integer> input, int toMove) {
		
		int left = 0;
		int right = input.size() - 1;
		
		while (left < right) {
				// move "right" index to left if the element is same as "toMove" 
			  for (int j=right; (j > 0 && left < right); j--) {
					if (input.get(j) == toMove) {
						right--;
					} else {
						break;
					}
			 }
			if (input.get(left) == toMove) {
				int temp = input.get(left);
				input.set(left, input.get(right));
				input.set(right, temp);
			}
			left++;
		}
		return input;
	}
}
