package com.examples.leetcode;

/**
 * Longest common prefix
 * 
 * https://www.youtube.com/watch?v=1YQmI7F9dJ0
 * 
 */
public class LC14 {

	public static void main(String[] args) {
		String[] strArray = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strArray));
	}

	private static String longestCommonPrefix(String[] strArray) {
		String longestCommonPrefix="";
		if (strArray == null || strArray.length == 0) return longestCommonPrefix;
		int index = 0;
		for (char c:  strArray[0].toCharArray()) {
			for (int i=1; i < strArray.length; i++) {
				if (index >= strArray[i].length() || c != strArray[i].charAt(index)) {
					return longestCommonPrefix;
				}
			}
			longestCommonPrefix+= c;
			index++;
		}
		return longestCommonPrefix;
	}
}
