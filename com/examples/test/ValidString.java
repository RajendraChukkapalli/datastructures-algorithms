package com.examples.test;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
 * 
 * @author AdminUser
 *
 */
public class ValidString {

	public static void main(String[] args) {

	}
	
	static String isValid(String s) {
	    final String GOOD = "YES";
	    final String BAD = "NO";

	    if(s.isEmpty()) return BAD;
	    if(s.length() <= 3) return GOOD;

	    int[] letters = new int[26];
	    for(int i = 0; i < s.length(); i++){
	        letters[s.charAt(i) - 'a']++;
	    }
	    Arrays.sort(letters);
		return null;
	    
	}

}
