package com.examples.leetcode;

public class LC258_Add_Digits {

	public static void main(String[] args) {
		System.out.print(addDigits(38));
	}
	
	public static int addDigits(int num) {
        if (num < 9) return num;
        int t = 0;
        while (num > 9) {
        	t = replace(num);
        	if (t > 9) {
        		num = t;
        	} else {
        		return t;
        	}
        }
        return t;
    }
	
	private static int replace(int num) {
		int newnum = 0;
		while (num > 0) {
			int t = num % 10;
			newnum = newnum + t;
			num = num / 10;
		}
		return newnum;
	}

}
