package com.examples.dynamicprogramming;

/**
 * Brute force for finding the longest Palindrome substring
 * 
 *
 */
public class LongestCommomPalindromeSubstringBruteForce {

	public static void main(String[] args) {

		String s ="jglknensknksgpiel";
		int maxLength = 0;
		String longestString = "";
		
		for (int i=0; i< s.length(); i++) {
			for (int j=i; j < s.length(); j++) {
				String sTemp = s.substring(i, j+1);
				System.out.println(sTemp);
				if ((sTemp.length() > maxLength) && isPalinDrome(sTemp)) {
					maxLength = sTemp.length();
					longestString = sTemp;
				}
			}
		}
		System.out.println(longestString);
	}

	private static boolean isPalinDrome(String sTemp) {
		StringBuilder builder = new StringBuilder(sTemp);
		String reverseString = builder.reverse().toString();
		return sTemp.equals(reverseString);
	}
}
