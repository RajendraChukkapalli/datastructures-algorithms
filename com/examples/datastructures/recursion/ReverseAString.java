package com.examples.datastructures.recursion;

import java.util.Stack;

public class ReverseAString {

	public static void main(String[] args) {
		
		String s = "Hello World!!!";
		System.out.println(reverseAString(s));
		System.out.println(reverseAStringUsingStack(s));
	}

	/**
	 * use recursion
	 * 
	 * @param s
	 * @return
	 */
	private static String reverseAString(String s) {
		if (s.equals("")) {
			return "";
		}
		return reverseAString(s.substring(1)) + s.charAt(0);
	}
	
	/**
	 * using stack
	 */
	private static String reverseAStringUsingStack(String s) {
	
		Stack<Character> charStack = new Stack<>();
		for (char c:  s.toCharArray()) {
			charStack.push(c);
		}
		StringBuilder builder = new StringBuilder();
		while (!charStack.isEmpty()) {
			builder.append(charStack.pop());
		}
		return builder.toString();
	}
}
