package com.examples.interview.tests;

/**
 * Given 2 numbers - if the number has '5' or '6', they can be 
 * exchanged means -> 45 can be of 46
 * 
 * find the min / max of 2 numbers 
 * 
 * for 11 - 35 => you should return 46, 47
 * for 45 - 64 => you should return 99 100
 *
 */
public class AbOvoTest {

	public static void main(String[] args) {
		String[] intArray = new String[2]; 
		intArray[0] = "11";
		intArray[1] = "35";
		findMinAndMax(intArray);
	}

	private static void findMinAndMax(String[] intArray) {
		boolean[] boolArr = new boolean[2];
		int index = 0;
		for (String str : intArray) {
			boolArr[index++] = checkIfNumHas5Or6(str);
		}
		int i = 0;
		StringBuilder builder = new StringBuilder();
		if(boolArr[i]) {
			
		} else {
			if (boolArr[i+1]) {
				String t = intArray[i+1]; 
				for (int k =0; i< t.length() ; k++) {
				}
			} else {
				int sum = Integer.parseInt(intArray[i]) + Integer.parseInt(intArray[i+1]); 
				builder.append(sum + " ");
				builder.append(sum + " ");
			}
		}
	}

	private static boolean checkIfNumHas5Or6(String str) {
		char c[] = Integer.valueOf(str).toString().toCharArray();
		for (char cTemp: c) {
			if (cTemp == '5' || cTemp == '6') {
				return true;
			}
		}
		return false;
	}
}
