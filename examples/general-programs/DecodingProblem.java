package com.examples.generalprograms;

/**
 * Number of ways convert this integer into Alphabets
 * 
 *
 */
public class DecodingProblem {

	public static void main(String[] args) {
		String data = "214567"; 
		int result = numberOfWays (data, data.length(), null);
		System.out.println(result);
	}

	private static int numberOfWays(String data, int l, String str) {
		
		if (l == 0 ) return 1;
		System.out.println(str);
		
		String subStr = data.substring(0, (data.length()+1 - data.length()));
		if (subStr.equals("0")) return 0 ;
		
		int result = numberOfWays(data, l-1, "LEFT");
		if (l >= 2 && (new Integer(data.substring(0, (data.length()+2 - data.length()))) < 26)) {
			result += numberOfWays(data, l-2, "RIGHT");
		}
		return result;
	}
}