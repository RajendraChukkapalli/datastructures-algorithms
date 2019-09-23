package com.examples.datastructures.stacksandqueues;

import java.util.Stack;

public class FactorialUsingStack {

	public static void main(String[] args) {
		int fact = 6;
		Stack newStack = new Stack();
		while (fact >= 1) { 
			newStack.push(fact--);
		}
		int result = 1;
		while (!newStack.isEmpty()) {
			result = result * (Integer)newStack.pop();
		}
		System.out.println(result);
	}
}
