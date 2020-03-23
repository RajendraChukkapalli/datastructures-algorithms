package com.examples.leetcode;

public class LC1108_DefangIPAddress {

	public static void main(String[] args) {
		String s = "1.1.1.1";
		System.out.println(defangIPaddr(s));
	}

	 public static String defangIPaddr(String address) {
	        StringBuilder builder = new StringBuilder();
	        char c[] = address.toCharArray();
	        for (char temp : c) {
	            if (temp == '.') {
	                builder.append("[.]");
	            } else {
	                builder.append(temp);
	            }
	        }
	        return new String(builder.toString());
	    }
}
