package com.examples.generalprograms;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 *  Merge 2 arrays.
 *  
 *  1. Merge 2 arrays by comparing array elements
 *  2. using priority queue
 *  
 */
public class Merge2Arrays {

	public static void main(String[] args) {
		  int[] a = new int[]{3, 4, 6, 10, 11, 15, 20,21,22,23};
		  int[] b = new int[]{1, 5, 8, 12, 14, 19};
		  System.out.println(Arrays.toString(mergeArrays(a, b)));
		  
		  System.out.println(Arrays.toString(mergeArrays2(a, b)));
	}

	private static int[] mergeArrays2(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		int index = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i=0; i < a.length; i++) {
			pq.add(a[i]);
		}
		for (int j=0; j < b.length; j++) {
			pq.add(b[j]);
		}
		while (!pq.isEmpty()) {
			c[index++] = pq.remove();
		}
		return c;
	}

	private static int[] mergeArrays(int[] a, int[] b) {
		
		int c[] = new int[a.length + b.length];
		
		boolean aTemp = true;
		boolean bTemp = true;
		
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		
		while (aTemp && bTemp) {
			if (aIndex > a.length-1 || bIndex > b.length-1) break;
			if (a[aIndex] < b[bIndex]) {
				c[cIndex++]  = a[aIndex++];
			} else if (b[bIndex] < a[aIndex]){
				c[cIndex++]  = b[bIndex++];
			} 
			System.out.println("aIndex = " + aIndex + "  bIndex =" + bIndex);
		}
		if (bIndex < b.length) {
			for (int i = bIndex; i < b.length; i++) {
				c[cIndex++] = b[i];
			}
		}
		if (aIndex < a.length) {
			for (int i = aIndex; i < a.length; i++) {
				c[cIndex++] = a[i];
			}
		}
		return c;
	}
}
