package com.examples.leetcode;

public class LC28_strStr {
	public static void main(String[] args) {
		String haystack = "mississippi";
		String needle = "issip";
		System.out.println(strStr(haystack, needle));
	}
	
	 public static int strStr(String haystack, String needle) {
	        
	        if (needle == null || needle.length() == 0) return 0;
	        
	        int needleLength = 0;
	        for (int j=0; j<haystack.length(); j++) {
	        	 if (needle.charAt(needleLength) == haystack.charAt(j)) {
	        		 needleLength++;
	        		 if (needleLength == needle.length()) {
	        			 return j - (needle.length()) + 1;
	        		 }
	        	 } else {
	        		 if (needleLength > 0) {
	        			 needleLength = 0;
	        		 }
	        	 }
	        }
	        return -1;
	    }
}
