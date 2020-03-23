package com.examples.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC3_3Sum {

	public static void main(String[] args) {

		String s = "aaaadddcc";
		int sum = 1;
		
		for (int i=s.length()-1; i >= 0; i--) {
			int digit = (s.charAt(i)-'a');
			sum = sum*digit;
			System.out.println(digit);
		}
	}

}
