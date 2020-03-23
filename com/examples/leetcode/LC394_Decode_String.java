package com.examples.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/decode-string/
 * 
 * https://www.youtube.com/watch?v=0iQqj5egK9k
 * 
 * 1. count the numbers and put it in count stack.
 * 2. '[' - when it encounters - put the res in result stack
 * 3. ']' - get count and add 'res' count number of times and add it to result
 * 4. if it is character, keep adding to 'res'
 * 
 */
public class LC394_Decode_String {

	public static void main(String[] args) {
		String s = "2[ac]abc3[abc]";
		System.out.println(decodeString(s));
	}

	private static String decodeString(String s) {
		
		Stack<Integer> counts = new Stack<Integer>();
		Stack<String> result = new Stack<String>();
		
		String res = "";
		int index = 0;
		
		while (index < s.length()) {
			// put the number in count stack
			if (Character.isDigit(s.charAt(index))) {
				int count = 0;
				while (Character.isDigit(s.charAt(index))) {
					count = count * 10 + (s.charAt(index) - '0');
					index += 1;
				}
				counts.push(count);
			// add the characters to stack	
			} else if (s.charAt(index) == '[') {
				result.add(res);
				res = "";
				index += 1;
			// ']' - get the char and count and add them up to 'res'
			} else if (s.charAt(index) == ']') {
				StringBuilder temp = new StringBuilder(result.pop());
				int count = counts.pop();
				for (int i=0; i < count; i++) {
					temp.append(res);
				}
				res = temp.toString();
				index += 1;
			// add all the characters
			} else {
				res += s.charAt(index);
				index += 1;
			}
		}
		return res;
	}
}
