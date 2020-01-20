package com.examples.leetcode;

import java.util.*;

/**
 * https://www.youtube.com/watch?v=21OuwqIC56E
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number
 * 
 */
public class LC17_Letter_Combinations {

	public static void main(String[] args) {
		String digits = "23";
		String combinations[] = {
								"0", "0", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		List<String> result = new ArrayList<>();
		letterCombinationsRecursive(result, digits, combinations, "", 0);
		System.out.println(result.toString());
		}

	private static void letterCombinationsRecursive(List<String> result, String digits, String[] combinations,
			String currentStr, int index) {
		if (digits.length() == index) {
			result.add(currentStr);
			return;
		}
		// with '0' char - it becomes 50 (equivalent of 2 in ASCII table)
		String letters = combinations[digits.charAt(index) - '0'];
		for (int i=0; i< letters.length(); i++) {
			letterCombinationsRecursive(result, digits, combinations, currentStr+letters.charAt(i), index+1);
		}
	}
}