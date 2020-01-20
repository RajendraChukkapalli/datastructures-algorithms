package com.examples.crack_code_interview.arrays_strings;

import java.util.Arrays;

// ask the following: 
//   a. like do we need to check upper case or lower case? 
//   b. white space matters? 
public class Check2StringsPermutation {

	public static void main(String[] args) {
		
	// 1. you can check both of the string have same identical characters
	// 2. sort the strings 
		
	String s = "hellooo";
	String s1 = "lloheoo111";
	
	System.out.println(checkBothHaveIdenticalCharacters(s, s1));	
	System.out.println(sortStrings(s, s1));
	}
	
	private static boolean sortStrings(String s, String s1) {
		if (s.length() != s1.length()) return false;
		String sTemp = sortString(s);
		String s1Temp = sortString(s1);
		return sTemp.equals(s1Temp);
	}
	
    static String sortString(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
    	return new String(charArray);
    }

	static boolean checkBothHaveIdenticalCharacters(String s, String t) {
		if (s.length() != t.length()) return false;
		
		int[] characters = new int[256];
		// manage character count and add the count
		for (int i=0; i< s.length(); i++) {
			characters[s.charAt(i)]++;
		}
		// reduce the character count. if it goes negative, return false.
		for (int i=0; i< t.length(); i++) {
			if (--characters[t.charAt(i)] < 0) {
				return false;
			};
		}
		return true;
	}
}
