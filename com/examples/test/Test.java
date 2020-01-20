package com.examples.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		String s = "23";
		
		String[] map = {"-1", "1111", "2222", "3333", "4444"};
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(c);
			String temp = map[s.charAt(i) - '0'];
			System.out.println(temp);
			System.out.println(map[s.charAt(i) - '0']);
			
		}
		
	}
}
