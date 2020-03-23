package com.examples.interview.tests;

//Write a function that, given an unbounded integer represented by a string 
//of ANY length (eg 2000 digits), returns a string that represents the 
//maximum possible value that can be obtained by inserting a single '5' 
//digit inside the decimal representation.

//"43694564507i050765075697597657"

//Examples:
//solution("268")  --> "5268"
//solution("670")  --> "6750"
//solution("0")    --> "50"
//solution("-999") --> "-5999"
//solution("888880") --> "5 888 880" / "8 888 850"

public class UpWork_MaxPossibleValue {

	public static void main(String[] args) {
		String strArr[] = {"268","670", "0", "-999", "9999", "3333", "888880"};
		int value = 5;
		for (String str :strArr) {
			System.out.println(maxPossibleValue(str, value));
		}
	}
	
	private static String maxPossibleValue(String str, int value) { 
	    
	    // we need to insert "5" to make it max possible value
	    // 268  =>  2,6,8  =>   2685 => 2658 => 2568 => 5678 (max)
	    // 670 => 5670,  6750
		
	    char c[] = str.toCharArray();
	    StringBuilder builder = new StringBuilder();
	    boolean flag = true;
	    for (int i=0; i< c.length; i++) {
	    	if ( c[i] == '-' ) {
	    		builder.append(c[i]);
	            builder.append(value);
	    	} else if ((c[i] - '0') < value ) {
    			if (flag) {
    				flag = false;
		            builder.append(value);
    			}
    			builder.append(c[i]);
	        } else {
	            builder.append(c[i]);
	        }
	    }
	    if (new String(c).equals(builder.toString())) {
	    	return value+""+builder.toString();
	    }
	    return builder.toString();
	}
}
