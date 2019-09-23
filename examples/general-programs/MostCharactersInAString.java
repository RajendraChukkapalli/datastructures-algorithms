package com.examples.generalprograms;

import java.util.HashMap;
import java.util.Set;

/**
 * Coding exercise to find the second-most repeated character in a String. 
 * Interviewer will look for ability to give proper syntax & cover all corner cases
 *
 */
public class MostCharactersInAString {

	public static void main(String[] args) {
		String inputStr  = "anvbcterdHHHdemadhfdahduiodl";
		HashMap<String, Integer> charCount = new HashMap<String, Integer>();
		for (int i=0, j = 1; i < inputStr.length(); i++, j++ ) {
			incrementIfExipsts(inputStr.substring(i, j), charCount);
		}
		
		Set<String> charSetArr = charCount.keySet();
		int max = -1; 
		int secomdMax = -1;
		for (String charSet : charSetArr) {
			System.out.println (charSet  +   " count = "  + charCount.get(charSet)); 
			
			if (max < charCount.get(charSet)) {
				max = charCount.get(charSet);
			} /*else { 
				if (secondMax < charCount.get(charSet) &&   )
				secomdMax  =  charCount.get(charSet);
				
			}*/
		}
		System.out.println (max);
	}

	private static void incrementIfExipsts(String char1, HashMap<String, Integer> charCountMap) {
		if (charCountMap.containsKey(char1)) {
			charCountMap.put(char1, charCountMap.get(char1).intValue() + 1);
		} else {
			charCountMap.put(char1, 1);
		}
	}
}
