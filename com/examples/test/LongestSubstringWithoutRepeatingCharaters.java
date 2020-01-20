package com.examples.test;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/submissions/detail/196219877/ (LC2)
 * 
 */
public class LongestSubstringWithoutRepeatingCharaters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
		
	 public static int lengthOfLongestSubstring(String s) {
	        
		    Set<Character> charSet = new HashSet<>();
		    int max = 0;
		    int i = 0; int j =0;
		    int n = s.length();
		    
		    // the technique is use 2 pointers
		     while (i < n && j < n) { 
		        if (!charSet.contains(s.charAt(j))) {
		            charSet.add(s.charAt(j++));
		            max = Math.max(max, (j-i));
		        } else {
		            charSet.remove(s.charAt(i++));
		        }
		    }
		    return max;
		  }

}
