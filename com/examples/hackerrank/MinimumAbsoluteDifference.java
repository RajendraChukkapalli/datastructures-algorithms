package com.examples.hackerrank;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {
		int [] intArry = {1, -3, 71, 68, 17};
		
		System.out.println(minimumAbsoluteDifference(intArry));
	}
	
	  static int minimumAbsoluteDifference(int[] arr) {
		  
		  Arrays.sort(arr);
		  
		    int min = Math.abs(arr[0] - arr [1]);
		    for(int i = 1 ; i < arr.length-1 ; i++){
		        if(Math.abs(arr[i] - arr[i+1]) < min)
		             min = Math.abs(arr[i] - arr[i+1]);
		    }

		return min;

	    }

}
