package com.examples.test;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
	int[]	missingNumberArr = {3,0,1};
	int i = Arrays.stream(missingNumberArr).max().getAsInt();
	System.out.println(missingNumber(missingNumberArr, i));
	
	}

	 public static int missingNumber(int[] nums, int size) {
		  
	        boolean[] boolArray = new boolean[size+1];
	        for (int num: nums) {
	        	boolArray[num]=true;
	        }
	        int i = 0;
	        for (; i< boolArray.length; i++)  {
	            if (boolArray[i] == false) {
	                break;
	            }
	        }
	        return i;
	    }
}
