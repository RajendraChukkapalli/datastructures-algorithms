package com.examples.test;

public class ArrayMultiplication {

	public static void main(String[] args) {
		
		int a[][] = new int[3][4];
		int b[][] = new int[4][3];
		
		int ab[][] = new int[3][3];
		
		for (int i=0; i< a.length; i++) {
			for (int j=0; j < a[i].length; j++) {
				a[i][j] = i+j;
			}
		}
		
		for (int i=0; i< b.length; i++) {
			for (int j=0; j < b[i].length; j++) {
				b[i][j] = i+j;
			}
		}
		
		
		
		for (int i=0; i< a.length; i++) {
			for (int j=0; j < b[i].length; j++) {
				ab[i][j] = (a[i][j] * b[i][j])
						    +  (a[i][j+1] * b[i+1][j])
						    + (a[i][j+2] * b[i+2][j]) 
							+ (a[i][j+3] * b[i+3][j]);
			}
		}
		
		System.out.println(a.toString()  + "  " + b.toString() + " " + ab.toString());
	}
}
