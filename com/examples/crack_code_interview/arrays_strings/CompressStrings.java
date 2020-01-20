package com.examples.crack_code_interview.arrays_strings;

/**
 * Take a string and compress it.
 * "aabcccccaaa" => "a2b1c4a3"
 * interview question from veem
 */
public class CompressStrings {

	public static void main(String[] args) {
		String s = "aabcccccaaa";
		compressString(s);
	}

	private static void compressString(String s) {
		if (s == null)
			return;
		StringBuffer buffer = new StringBuffer();
		char c = s.charAt(0);
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			} else {
			   buffer.append(c).append(count);
			   c = s.charAt(i);
			   count = 1;
			}
		}
		buffer.append(c).append(count);
		System.out.println(buffer.toString());
	}
}
