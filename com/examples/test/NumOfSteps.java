package com.examples.test;

public class NumOfSteps {

	public static void main(String[] args) {
		System.out.println(numberOfSteps(14));
	}

    public static int numberOfSteps (int num) {
        int count = 0;
        while (num > 0) {
            int rem = num % 2;
            if (rem % 2 != 0) {
                num = num - 1;
                count += 1;
            } else {
                num = num / 2;
                count += 1;
            }
        }
        return count;
    }
}
