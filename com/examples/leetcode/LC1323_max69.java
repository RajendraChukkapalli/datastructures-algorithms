package com.examples.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/maximum-69-number/
 */
public class LC1323_max69 {

	public static void main(String[] args) {
		System.out.println(maximum69Number(9669));
	}

	
	  public static int maximum69Number (int num) {
		    int max = Integer.MIN_VALUE;
		    char c[]  =  String.valueOf(num).toCharArray();
		    int temp = ' ';
		    List<Integer> listOfIntegers = new ArrayList<Integer>();
		    for (int i=0; i< c.length; i++) {
		    	if (c[i] == '9') {
		    		temp += ('6' - '0');
		    	} else if (c[i] == '6') {
		    		temp += '9' - '0';
		    	}
		    	Integer val = Integer.valueOf(String.valueOf(c).toString());
		    	listOfIntegers.add(val);
		    	max = Math.max(max,val);
		    }
		   // listOfIntegers.stream()..of
		    return max;
	  }
}
