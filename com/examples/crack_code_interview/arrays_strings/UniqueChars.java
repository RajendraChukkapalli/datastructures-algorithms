package com.examples.crack_code_interview.arrays_strings;

public class UniqueChars {

	public static void main(String[] args) {
		
		String s = "Rajendr Chukpli";
		System.out.println(isUniqueCharacters(s));
		
		String s1 = "Rajendra Chukkapalli";
		System.out.println(isUniqueCharacters(s1));
		
		System.out.println("------------------------------");
		
		String s3 = "Rajendr Chukpli";
		System.out.println("s3 =>" + isUniqueCharacters2(s3));
		
		String s4 = "Rajendra Chukkapalli";
		System.out.println("s4 =>" +  isUniqueCharacters2(s4));
	}
	
	// Ask whether the string has only ASCII characters or Unicode characters?
	// ASCII has 256 characters 
	// 0 - 31, 127 control characters 
	// 32 - 126 printable characters
	// 127 - 255 extended ASCII characters
	static boolean isUniqueCharacters(String s) {
		
		if (s.length() > 256) return false;
		
		boolean[] boolArray = new boolean[256];
		
		for (int i=0; i< s.length(); i++) {
			int val = s.charAt(i);
			if (boolArray[val]) { // true. means already found.
				return false;
			}
			boolArray[val] = true;
		}
		return true;
	}
	
	/**
	 * this solution takes O(n2) runtime complexity as we compare character by character
	 */
	static boolean isUniqueCharacters2(String s) { 
		for (int i=0; i< s.length(); i++) {
			int value = s.charAt(i);
			for (int j=0; j< s.length(); j++) {
				if (i == j) continue;
				int value2 = s.charAt(j);
				if (value == value2) return false;
			}
		}
		return true;
	}
}
 