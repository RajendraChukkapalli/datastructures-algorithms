package com.examples.leetcode;

import java.util.*;

public class LC1417_Reformat_String {

	public static void main(String[] args) {

		final String s = "covid2019";
		System.out.println(reformat(s));

	}

	public static String reformat(String s) {

		List<Character> digits = new ArrayList<>();
		List<Character> chars = new ArrayList<>();

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				digits.add(c);
			} else {
				chars.add(c);
			}
		}
		if (Math.abs(digits.size() - chars.size()) > 1)
			return "";

		StringBuilder builder = new StringBuilder();
		boolean startWithDigits = digits.size() > chars.size() ? true : false;

		for (int i = 0; i < s.length(); i++) {
			if (startWithDigits) {
				if (digits.size() > 0) {
					builder.append(digits.remove(0));
				}
			} else {
				if (chars.size() > 0) {
					builder.append(chars.remove(0));
				}
			}
			startWithDigits = !startWithDigits;
		}
		return builder.toString();
	}
}
