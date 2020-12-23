package com.examples.interview.tests;

/**
 * Given an integer wrapped in string, convert it into integer.
 *
 */
public class ConvertStringToNumber {
	
	public static void main(String args[]) {
		String s = "23456";
		int num = 0;
		int index = 0;
		int factor = 1;
		for (int i = (s.length() - 1); i >= 0; i--) {
			if (index == 0) {
				num = s.charAt(i)-'0';
			} else {
				factor = 10 * factor;
				int temp = s.charAt(i)-'0';
				num = temp * factor + num;
			}
			index = index + 1;
		}
		System.out.print(num + 1);
	}
}
