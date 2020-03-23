package com.examples.leetcode;

import java.util.Stack;

public class LC32_Longest_Valid_Paramtheses {

	public static void main(String[] args) {
		System.out.println(longestValidParentheses(")()())"));
	}

	public static int longestValidParentheses(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			switch (c) {
			case '(':
				if (!stack.isEmpty() && stack.peek() != '(') {
					stack.push(c);
					break;
				} else if (stack.isEmpty()){
					stack.push(c);
					break;
				}
			case ')':
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.add(')');
					break;
				}
			}
		}
		return stack.size();
	}

}
