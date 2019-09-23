package com.examples.datastructures.stacksandqueues;

import java.util.Stack;

/**
 * Given the brackets, check whether they are balanced or unbalanced 
 * 
 *  {()}
 * 
 */
public class BalancedBracketsUsingStack {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "{(()()(){})}";
		System.out.println(isBalanced(str));
	}
	
	public static boolean isBalanced(String expression) {
		// Must be even
		if ((expression.length() & 1) == 1) return false;
		else {
		  char[] brackets = expression.toCharArray();
		  Stack<Character> s = new Stack<>();
		  for (char bracket : brackets)
		    switch (bracket) {
		      case '{': s.push('}'); break;
		      case '(': s.push(')'); break;
		      case '[': s.push(']'); break;
		      default :
		    	// ( bracket != s.peek())  why do we need this condition? 
		    	// this is needed to check the characters you are using
		    	// if you encounter any other character than the defined - you can safely say this is not balanced
		        if (s.empty() || bracket != s.peek()  )
		          return false;
		        s.pop();
		    }
		  return s.empty();
		}
	}
}
