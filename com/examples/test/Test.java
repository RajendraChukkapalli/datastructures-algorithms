package com.examples.test;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		String paragraph = "Bob";
		String banned[] = {};

		// System.out.println(mostCommonWord(paragraph, banned));
		
//	    Integer b = 14;
//	    System.out.println(Integer.toBinaryString(b));
//	    b = b >> 1;
//	    System.out.println(Integer.toBinaryString(b));
	    
	    
//	    String digits = "23";
//	    int index = 0;
	    
	    // System.out.println(isUgly(9));
		
		int i = 4;
		int j = 0;
		int k = 0;
		int l = 1;
		int m = 1;
		int n = 2;
		int p = 3;
		int q = 3;
		int r = 4;
		
		int i1 = i ^ j;
		System.out.println(i1);
		int i2 = i1 ^ k;
		System.out.println(i2);
		int i3 = i2 ^ l;
		System.out.println(i3);
		int i4 = i3 ^ m;
		System.out.println(i4);
		
		
		System.out.println( 4 ^ 0 ^0 ^ 1 ^ 1 ^ 2 ^3 ^3 ^4);
	    
//	    String combinations[] = {
//				"0", "0", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//	    
//	    System.out.println(digits.charAt(index));
//	    int i = digits.charAt(index);
//	    System.out.println(i);
//	    String letters = combinations[i];
//	    
//	    System.out.println(letters);
	    
//	    int i[] = {2,3,4,0};
//	    for (int j = i.length - 1; j > 0; j--) {
//            i[j] = i[j-1];
//        }
//	    System.out.println(i);
	    
	

//		String s[] = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
//		for (String t: s) {
//			 System.out.println(t);
//		}
	}

	public static String mostCommonWord(String paragraph, String[] banned) {

		paragraph += ".";

		Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
		// StringTokenizer st = new StringTokenizer(paragraph, "?',;. !");

		int max = -1;
		String result = "";

		Map<String, Integer> map = new HashMap<>();
		StringBuilder word = new StringBuilder();
		for (char c : paragraph.toCharArray()) {
			if (Character.isLetter(c)) {
				word.append(Character.toLowerCase(c));
			} else if (word.length() > 0) {
				String s = word.toString();
				if (!bannedWords.contains(s)) {
					map.put(s, map.getOrDefault(s, 0) + 1);
					if (map.get(s) > max) {
						result = s;
						max = map.get(s);
					}
				}
				word = new StringBuilder();
			}
		}
		return result;
	}
	
    public static boolean isUgly(int num) {
        if(num == 0) return false;
        if(num == 1) return true;
        
        while(num%2 == 0) {
        	num = num/2;        
        }
        while(num%3 == 0) num = num/3;        
        while(num%5 == 0) num = num/5;
        
        return num == 1;
    }
}
