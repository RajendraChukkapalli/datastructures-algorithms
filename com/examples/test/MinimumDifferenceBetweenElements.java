package com.examples.test;

import java.util.Arrays;

public class MinimumDifferenceBetweenElements {

	public static void main(String[] args) {
		int[] arr = {-59, -36 ,-13 ,1, -53, -92, -2, -96, -54, 75};
		
		System.out.println(minimumAbsoluteDifference(arr));
	}
	
	static int minimumAbsoluteDifference(int[] arr) {
		Arrays.sort(arr); 	 
        int min =Math.abs(arr[0]);
        for (int i=0; i< arr.length-1; i++) {
                    int diff = Math.abs(arr[i] - arr[i+1]);
                    if (diff < min ) {
                    	min = diff;
                    }
        }
        return min;
    }
}
	