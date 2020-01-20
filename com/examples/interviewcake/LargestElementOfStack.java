package com.examples.interviewcake;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://www.interviewcake.com/question/java/largest-stack
 * 
 *  implement a new class MaxStack with a method getMax() that returns the largest element in the stack. 
 *  getMax() should not remove the item.
 *
 */
public class LargestElementOfStack {
	public static void main(String[] args) {
		final MaxStack s = new MaxStack();
        s.push(5);
        System.out.println("check max after 1st push = " + s.getMax());
        s.push(4);
        s.push(7);
        s.push(7);
        s.push(8);
        System.out.println("check max after 1st push = " + s.getMax());
        s.pop();
        System.out.println("check max after 1st push = " + s.getMax());
        s.pop();
        s.pop();
        System.out.println("check max after 1st push = " + s.getMax());
        
        System.out.println("get size = " + s.getSize());
        
	}
}


class MaxStack {
	
	private Deque<Integer> stack = new ArrayDeque<>();
	private Deque<Integer> maxesStack = new ArrayDeque<>();
	  
	public void push(int item) {
		 stack.push(item);
		 if (maxesStack.isEmpty() || item >= maxesStack.peek()) {
	            maxesStack.push(item);
	     }
	}
	
	public int pop() {
		 int item = stack.pop();
		 if (item == maxesStack.peek()) {
	            maxesStack.pop();
	      }
		 return item;
	}
	
	public int getMax() {
		return maxesStack.peek();
	}
	
	public int getSize() {
		return stack.size();
	}
}