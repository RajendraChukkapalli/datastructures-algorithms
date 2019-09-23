package com.examples.generalprograms;

public class RemoveDuplicatesInAnUnsortedArray {

	public static void main(String[] args) {

		String strArray[]   =  {"1", "3", "4", "7", "1", "5", "7", "3", "3"};
		String outArray[]    = new String[strArray.length];
		int k = 0;
		for (int i = 0; i < strArray.length ; i++) { 
			for (int j = 0; j < strArray.length; j++) {
				if (strArray[i] != null && strArray[i].equals(strArray[j])) {
					if (outArray != null && !hasElement(strArray[i], outArray)) {
						outArray[k] = strArray[j]; 
						k += 1;
					}
				}
			}
		}
		for (String arrayElement  : outArray) {  
			System.out.println(arrayElement);
		}
	}

	private static boolean hasElement(String string, String[] outArray) {
		boolean isPresent = false; 
		if (outArray != null && string != null ) {
			for (String arrayElement  : outArray) { 
				if (arrayElement != null ) {
					if (string.equals(arrayElement)) { 
						isPresent = true;
						break;
					}
				}
			}
		}
		return isPresent;
	}
}
