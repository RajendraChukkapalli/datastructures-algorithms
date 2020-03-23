package com.examples.generalprograms;

/**
 * https://www.hackerrank.com/challenges/repeated-string/problem
 *
 */
public class RepeatedString {

	public static void main(String[] args) {
		String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
		Long n = 736778906400L;
		repeatedString(s, n);
	}

	
	// amazing answer - copied from Hacker Rank.
	public static void repeatedString(String s, Long n) {
	    long count =0;
	    for(char c : s.toCharArray()) {
	        if(c == 'a')
	        count++;
	     }
	     long factor = (n/s.length());
	     long rem = (n%s.length());
	     count =  factor*count  ;
	    for(int i=0;i<rem;i++)
	        if(s.charAt(i)=='a')
	                count++;        
	    System.out.println(count);
	}
}
