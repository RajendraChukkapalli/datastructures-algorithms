package com.examples.test;

public class StringConstruction {

	public static void main(String[] args) {
		System.out.println(stringConstruction("abab"));
	}
	
	static int stringConstruction(String s) {
        int i = 0; 
        int count = 0;
        StringBuilder build = new StringBuilder();
        while (i < s.length()) {
            System.out.println(s);
            if (build.toString().equals(s.substring(i, s.length()))) {
                build.append(s.substring(i));
                break;
            } else {
                System.out.println(s.substring(i, i+1));
                build.append(s.substring(i, i+1));
                i++;
            }
            count ++;
        }
        return count;
    }
}
