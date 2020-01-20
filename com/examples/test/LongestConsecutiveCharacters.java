package com.examples.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LongestConsecutiveCharacters {

	public static void main(String[] args) {
		Map<Character, Integer> charCountMap = longestConsecutiveCharacters("aaaaaaaaaaaaabbcccddddddd");
		System.out.println(charCountMap.toString());
	}
	
	static Map<Character, Integer> longestConsecutiveCharacters(String s) {
		
		int count = 0;
	    char prevChar = ' ';
	    Map<Character, Integer> charCount = new HashMap<>();
		
		for (int i=0; i< s.length(); i++) {
			char currChar = s.charAt(i);
			if (currChar != prevChar) {
				charCount.put(prevChar, (charCount.get(prevChar) == null ? 0 : charCount.get(prevChar)) + count);
				count = 1;
				prevChar = currChar;
			} else {
				count ++;
			}
		}
		charCount.put(prevChar, count);
		int max = Integer.MIN_VALUE;
		Set<Entry<Character, Integer>> charset = charCount.entrySet();
		char cTemp = ' ';
		for (Entry<Character, Integer> char1 : charset ) { 
			if (char1.getValue() > max) {
				max = char1.getValue();
				cTemp = char1.getKey(); 
			}
		}
		 Map<Character, Integer> charCount2 = new HashMap<>();
		 charCount2.put(cTemp, max);
		return charCount2;
	}
}
