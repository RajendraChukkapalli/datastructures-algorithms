package com.examples.test;

import java.util.Arrays;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
		int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};

		System.out.println(Arrays.toString(mergeSortedArrays(myArray, alicesArray)));
		System.out.println(Arrays.toString(mergeSortedArrays2(myArray, alicesArray)));
		System.out.println(Arrays.toString(mergeArrays(myArray, alicesArray)));

	}
	
	  public static int[] mergeSortedArrays(int[] myArray, int[] alicesArray) {
		    int[] mergedArray = Arrays.copyOf(myArray, myArray.length + alicesArray.length);
		    System.arraycopy(alicesArray, 0, mergedArray, myArray.length, alicesArray.length);
		    Arrays.sort(mergedArray);
		    return mergedArray;
		}
	  
	  // 'a' can be exhausted. then populate only b
	  // 'b' can be exhausted. then populate only a
	  public static int[] mergeSortedArrays2(int[] myArray, int[] alicesArray) {
		
		  int a[] = {3,6,9};
		  int b[] = {1,4,5,10,13,25,29};
		  
		  int abLength = a.length + b.length;
		  int ab[] = new int[abLength];
		  int i = 0; int j= 0; int k = 0;
		  while (k < abLength) {
			  boolean aTemp = i >= a.length;
			  boolean bTemp = j >= b.length;
			  if (aTemp) { 	
				  ab[k] = b[j];
				  j++;
			  } else if (bTemp) {
				  ab[k] = a[i];
				  i++;
			  } else if ( a[i] < b[j]) {
				  ab[k] = a[i];
				  i++;
			  } else {
				  ab[k] = b[j];
				  j++;
			  }
			  k++; 
		  }
		  return ab; 
	  }

	  
	  public static int[] mergeArrays(int[] myArray, int[] alicesArray) {

		    int[] mergedArray = new int[myArray.length + alicesArray.length];

		    int currentIndexAlices = 0;
		    int currentIndexMine   = 0;
		    int currentIndexMerged = 0;

		    while (currentIndexMerged < mergedArray.length) {

		        // case: my array is exhausted
		        if (currentIndexMine >= myArray.length) {
		            mergedArray[currentIndexMerged] = alicesArray[currentIndexAlices];
		            currentIndexAlices++;

		        // case: Alice's array is exhausted
		        } else if (currentIndexAlices >= alicesArray.length) {
		            mergedArray[currentIndexMerged] = myArray[currentIndexMine];
		            currentIndexMine++;

		        // case: my item is next
		        } else if (myArray[currentIndexMine] < alicesArray[currentIndexAlices]) {
		            mergedArray[currentIndexMerged] = myArray[currentIndexMine];
		            currentIndexMine++;

		        // case: Alice's item is next
		        } else {
		            mergedArray[currentIndexMerged] = alicesArray[currentIndexAlices];
		            currentIndexAlices++;
		        }

		        currentIndexMerged++;
		    }

		    return mergedArray;
		}
}
