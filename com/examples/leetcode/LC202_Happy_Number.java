package com.examples.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC202_Happy_Number {

	public static void main(String[] args) {
		System.out.print(isHappy(19));
	}

	public static boolean isHappy(int n) {

		Set<Integer> seen = new HashSet<>();
		while (!seen.contains(n)) {
			seen.add(n);
			int newNum = replace(n);
			if (newNum == 1)
				return true;
			n = newNum;
		}
		return false;
	}

	private static int replace(int num) {
		int newnum = 0;
		while (num > 0) {
			int t = num % 10;
			newnum = newnum + (t * t);
			num = num / 10;
		}
		return newnum;
	}
}
