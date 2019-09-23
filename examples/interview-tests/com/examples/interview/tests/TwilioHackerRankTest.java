package com.examples.interview.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 *  1. 4th bit
 *	2. string matching
 *  3. can you sort (array sorting)
 *     {1,2,6,6,3,3,4,5,5,5}
 *     to
 *     {
 *  4. k-subsequences
 *
 */
public class TwilioHackerRankTest {

	public static void main(String[] args) {
		
		// get the 4th bit
		int num = 255;
		char bit4 = get4ThBit(num);
		System.out.println(bit4);
		
		// string manipulation
		String s = "I am using HackerRank to improve programming abc";
		String t = "am HackerRank to improve";
		List<String> words = missingWords(s,t);
		words.stream().forEach(word -> System.out.println(word));
		
		
		// comvert the integer to hexa decimal value
		String hex  = convertIntToHex(num);
		System.out.println(hex);
		
		// comvert the integer to octa decimal value
		String oct  = convertIntToOct(num);
		System.out.println(oct);
	}

	private static String convertIntToHex(int num) {
		
		char[] c = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		StringBuilder builder = new StringBuilder();
		while (num > 0) {
			int hex = num % 16;
			builder.append(c[hex]);
			num = num / 16;
		}
		return builder.reverse().toString();
	}

	
	private static String convertIntToOct(int num) {
		
		char[] c = new char[]{'0','1','2','3','4','5','6','7'};
		
		StringBuilder builder = new StringBuilder();
		while (num > 0) {
			int hex = num % 8;
			builder.append(c[hex]);
			num = num / 8;
		}
		return builder.reverse().toString();
	}
	
	private static char get4ThBit(int num) {
		
		StringBuilder builder = new StringBuilder();
		while (num > 0) {
			int binaryDigit = num % 2;
			builder.append(binaryDigit);
			num = num / 2;
		}
		String temp = builder.reverse().toString();
		System.out.println(temp);
		if (temp.length() >= 4) {
			int	index = (temp.length()) - (4);
			char m = temp.charAt(index);
			return m;
		}
		return ' ';
	}
	
	
	public static List<String> missingWords(String s, String t) {
        // to capture the missing words. 
        // since we dont know the size keep the max
        boolean found = false;
        String  tempToken = "";
        List<String>  sList =  getTokensWithCollection(s);
        List<String> tList = getTokensWithCollection(t);
        List<String> outputList = new ArrayList<>();
        for (String sToken :  sList) {
            for (String tToken:  tList) {
                if (tToken.equals(sToken)) {
                    found = true;
                    tempToken = "";
                    break;
                } else {
                    tempToken = sToken;
                    found = false;
                }
            }
            // not found - add it to output array (missing words)
            if (!found) {
                outputList.add(tempToken);
                tempToken="";
            }
        }
        return outputList;
    }
	
    /**
     * Convert the string to tokens
     */ 
    public static List<String> getTokensWithCollection(String str) {
        return Collections.list(new StringTokenizer(str, " "))
                          .stream()
                          .map(token -> (String) token)
                          .collect(Collectors.toList());
    }

}
