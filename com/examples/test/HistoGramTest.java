package com.examples.test;

public class HistoGramTest {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 17, 19, 21, 22, 25, 26, 28, 29, 32, 33, 34, 35 };
		int base10 = 0;
		for (int count = 0; count < nums.length -1 ; count += 10) {
			System.out.print(count + " - " + (base10+=10) + "  | " );
			for (int index = count; index < base10; index++) {
				if (nums[index] > 0) {
					System.out.print("*");
					nums[index]--;
				}
			}
			System.out.println();
		}
	}
}
