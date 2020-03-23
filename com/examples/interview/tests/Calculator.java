package com.examples.interview.tests;

public class Calculator {
	public static void main(String[] args) {
		calculate("6+9-12"); 
	}

	private static void calculate(String string) {
		char c[] = string.toCharArray();
		int sum = 0;
		int tempNum = 0;
		int count = 0;
		boolean flag = true;
		for (int i=0; i < c.length; i++) {
			
			if (c[i] == '+' || c[i] == '-') {
				int[] nums = new int[2];
				nums = find2Nums(c, i);
			}
			
		}
		}

	private static int[] find2Nums(char[] c, int i) {
		int [] nums = new int[2];
		int num1 = 0;
		int num2 = 0;
		for (int j=0; j < i; j--) {
			if(Character.isDigit(c[j])) {
				num1 = (c[j] - '0') + (10 * i-1);
			}
		}
		for (int j=i+1; j > i; j--) {
			if(Character.isDigit(c[j])) {
				num2 = (c[j] - '0') + (10 * i-1);
			} else {
				break;
			}
		}
		nums[0] = num1;
		nums[1] = num2;
		return nums;
	}
}

		
//		// if the number is digit
//		// find the length of the number
//		// this needs to be calculated 
//		if (Character.isDigit(c[i])) {
//			if (flag) {
//				count = countNumber(c, i);
//				flag = false;
//			}
//			--count;
//			tempNum +=  (c[i] - '0') + (10 * count);
//		} else {
//			switch(c[i]) {
//				case '+': 
//					sum+=tempNum;
//					break;
//				case '-': 
//					sum-=tempNum;
//					break;
//			}
//			count = 0;
//			tempNum = 0;
//			flag = true;
//		}
//	}
//	System.out.println("sum = " + sum);
//}
//
//private static int countNumber(char[] carr, int i) {
//	int count = 0;
//	for (int index=i; index < carr.length; index++) {
//		if (carr[index] == '+' || carr[index] == '-') {
//			break;
//		} else {
//			count += 1;
//		}
//	}
//	return count;
//}