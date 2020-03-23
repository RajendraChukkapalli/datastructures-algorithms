package com.examples.leetcode;

public class LC_917_Reverse_only_chars {

	public static void main(String[] args) {
		String s = "782_]";
		System.out.println(reverseOnlyLetters(s));
	}

	public static String reverseOnlyLetters(String S) {
		int left = 0;
		int right = S.length() - 1;
		char[] carray = S.toCharArray();
		while (left < right) {
			if (left < right && !Character.isLetter(carray[left])) {
				left++;
			}
			if (right > left && !Character.isLetter(carray[right])) {
				right--;
			}
			char c = carray[right];
			carray[right] = carray[left];
			carray[left] = c;

			left++;
			right--;
		}
		return new String(carray);
	}
}
