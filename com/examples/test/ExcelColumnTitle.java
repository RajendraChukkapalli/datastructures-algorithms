package com.examples.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExcelColumnTitle {
	// Function to print Excel column
	// name for a given column number
	public static void main(String args[]) {
		printString2(26);
	}

	private static void printString(int columnNumber) {
		// To store result (Excel column name)
		StringBuilder columnName = new StringBuilder();

		while (columnNumber > 0) {
			// Find remainder
			int rem = columnNumber % 26;

			// If remainder is 0, then a
			// 'Z' must be there in output
			if (rem == 0) {
				columnName.append("Z");
				columnNumber = (columnNumber / 26) - 1;
			} else // If remainder is non-zero
			{
				columnName.append((char) ((rem - 1) + 'A'));
				columnNumber = columnNumber / 26;
			}
		}
		// Reverse the string and print result
		System.out.println(columnName.reverse());
	}
	
	
	private static void printString2(int n) { 
		
		 List<Character> list = new ArrayList();
		 for(char c = 'A'; c <= 'Z'; c++) list.add(c);
		 Stack<Character> stack = new Stack();
		List<Integer> remList = new ArrayList<>();
		
		while(n != 0){
            n--;
            char k = list.get(n % 26 );
            stack.push(k);
            n = n / 26;
        }
		 StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb.toString());
		
//		while (columnNumber > 0) {
//		      int rem = columnNumber % 26;
//		      remList.add(rem);
//		      if (rem == 0) {
//		    	  columnNumber--;
//		      }
//		      columnNumber = columnNumber / 26;
//		}
		//remList.forEach(n -> System.out.println(n));
	}
}
