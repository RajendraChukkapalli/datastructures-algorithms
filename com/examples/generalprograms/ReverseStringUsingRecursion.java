package com.examples.generalprograms;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
	 String s = "abcd";
	 System.out.println(reverseString(s));
	}

	private static String reverseString(String s) {
		if (s.length() == 0) 
			return s;
		String c = s.substring(s.length() - 1);
		String sTemp = c + reverseString(s.substring(0, s.length() - 1)) ;
		return sTemp;
	}
}
