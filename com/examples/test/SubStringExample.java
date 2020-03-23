package com.examples.test;

public class SubStringExample {

	public static void main(String[] args) {
		String s ="abacdefabcba";
		for (int i=0; i< s.length(); i++) {
			for (int j=i; j < s.length(); j++) {
				int length = j+1;
				String sTemp = s.substring(i, length);
				System.out.println("length = " + length + " " + "sTemp =" + sTemp);
			}
		}
	}

}
