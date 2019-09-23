package com.examples.generalprograms;

/**
 * Reverse a string in-place
 * 
 */
public class ReverseStringInPlace {

	public static void main(String[] args) {
		String s = "Hello World !!!";
		reverse (s.toCharArray());
	}
	
	public static void reverse(char[] arrayOfChars) {

	    int leftIndex = 0;
	    int rightIndex = arrayOfChars.length - 1;

	    while (leftIndex < rightIndex) {

	        // swap characters
	        char temp = arrayOfChars[leftIndex];
	        arrayOfChars[leftIndex] = arrayOfChars[rightIndex];
	        arrayOfChars[rightIndex] = temp;

	        // move towards middle
	        leftIndex++;
	        rightIndex--;
	    }
	    StringBuilder builder = new StringBuilder();
	    for (char c: arrayOfChars) {
	    	builder.append(c);
	    	
	    }
	    System.out.println(builder.toString());
	}

}
