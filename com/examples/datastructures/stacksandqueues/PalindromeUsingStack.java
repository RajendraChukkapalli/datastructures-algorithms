package com.examples.datastructures.stacksandqueues;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 1.  char by char are pushed into stack 
 * 2.  'pop' then and covert them into a string
 * 3.  compare the string
 * 4.  if they are equal, it is a palindrome. 
 *
 */
public class PalindromeUsingStack {

	public static void main(String[] args) {
		
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true 
        System.out.println(checkForPalindrome("Don't nod"));
        
        System.out.println(checkForPalindromeUsingStack("I did, did I?"));

	}

	private static boolean checkForPalindrome(String string) {
		
		LinkedList<Character>  charList = new LinkedList<Character>();
		StringBuilder s1 = new StringBuilder (string.length());
		String lowerString = string.toLowerCase();
		
		// push the characters into linked list
		for (int i=0; i < lowerString.length(); i++) {
			char c =  lowerString.charAt(i);
			if (c >= 'a' && c <= 'z') { 
				s1.append(c);
				charList.push(c);
			}
		}
		
		StringBuilder s2 = new StringBuilder();
		// pop the characters from the linked list 
		while (!charList.isEmpty()) {
			s2.append(charList.pop());
		}
	  System.out.println("-----------------------------------");
	  System.out.println(s1.toString());
	  System.out.println(s2.toString());
	  System.out.println("-----------------------------------");
		return s1.toString().equals(s2.toString());
	}
	
	private static boolean checkForPalindromeUsingStack(String string) {
		
		char[] brackets = string.toCharArray();
		  Stack<Character> s = new Stack<>();
		  for (char c : brackets) {
			  s.push(c);
		  }
		  StringBuilder result = new StringBuilder();
		  while(!s.isEmpty()) {
			  result.append(s.pop());
		  }
		  System.out.println("-----------------------------------");
		  System.out.println(string);
		  System.out.println(result.toString());
		  System.out.println("-----------------------------------");
		return false;
	}
	

}
