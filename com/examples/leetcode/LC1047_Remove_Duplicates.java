package com.examples.leetcode;

import java.util.Stack;

public class LC1047_Remove_Duplicates {

	public static void main(String[] args) {
		System.out.println(removeDuplicates("abbaca"));

	}
	
	 public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<S.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == S.charAt(i)){
                stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
