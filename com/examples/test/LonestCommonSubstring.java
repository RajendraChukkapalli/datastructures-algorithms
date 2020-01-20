package com.examples.test;

public class LonestCommonSubstring {

	public static void main(String[] args) {
		
		String s1 = "ABAB";
		String s2 = "BABA";
		
		longestCommonSubstring( s1,  s2);
		
		
	}
	
	/**
	 * Brute force approach is to compare s1 against s2 for 
	 * 
	 * 1. Compare A against s2 like B A B A
	 * 2. Compare AB against S2. like BA, AB, BA
	 * 3. Compare ABA against s2 like BAB ABA
	 * 4. Compare ABAB against s2 like BABA 
	 * 
	 * Continue with next character B, A and B like above 
	 * 
	 */
	private static void longestCommonSubstring(String s1, String s2) {
		
		int max = Integer.MIN_VALUE;
		//for (int temp=0; temp < s1.length(); temp ++) {
			for (int s1Start=0, i=0 ;i < s1.length(); i++) {
				String s1sub = s1.substring(s1Start, i+1);
				for (int s2Start=0, j=i ; j < s2.length(); j++) {
					String s2Sub = s2.substring(s2Start,j+1); 
					System.out.println(s1sub  + " " + s2Sub);
					if (s1sub.equals(s2Sub)) {
						System.out.println("equal => " + s1sub  + " " + s2Sub);
						max = Math.max(max,  s2Sub.length());
					} else {
						System.out.println("NOT equal => " + s1sub  + " " + s2Sub);
					}
				}
				System.out.println("---------------");
				s1Start = s1Start +1;
			}
		//}
		System.out.println("max ==> " + max);
	}

}
