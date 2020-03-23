package com.examples.leetcode;

public class LC709 {

	public static void main(String[] args) {

		String str = "hello";
		
		System.out.println('A'+0);
		System.out.println('a'+0);
		System.out.println('0'+0);
		
		char c[] = str.toCharArray();
        for (int i=0; i < c.length; i++) {
            if (c[i] >= 'a' && c[i] <= 'z' ) {
                c[i] =  (char) (c[i] - 32);
            }          
        }
        System.out.println(new String(c));
	}
}
