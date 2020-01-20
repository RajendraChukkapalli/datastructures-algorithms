package com.examples.interviewcake;

/**
 * https://www.interviewcake.com/question/java/reverse-words?course=fc1&section=array-and-string-manipulation
 * 
 * given a sentence - reverse all the words
 *
 */
public class ReverseWordsInASentence {

	public static void main(String[] args) {
		
		String message = "cake pound steal";
		
		// first reverse the characters
		//     -- if you try to reverse words in place 
		//        there are issues related to word lengths 
		//        and moving the next words to accommodate the word
		// 
		// second - keep the current word index find the space and try to reverse the string

		// reverse the characters
		char c[] = message.toCharArray();
		int i = 0;
		int j = message.length() -1;
		while (i < j) {
			char t = c[i];
			c[i] = c[j];
			c[j] = t;
			i++;
			j--;
 		}
		// second step 
		int currentWordsIndex = 0;
		for (int k=0; k <= c.length; k++) {
			if (k == c.length || c[k] == ' ') {
				reverseCharacters(c, currentWordsIndex, k-1);
				currentWordsIndex = k+1;
			}
		}
		System.out.println(c);
	}

	private static void reverseCharacters(char[] c, int leftIndex, int rightIndex) {
		while (leftIndex < rightIndex) {
			char t = c[leftIndex];
			c[leftIndex] = c[rightIndex];
			c[rightIndex] = t;
			leftIndex++;
			rightIndex--;
		}
	}
}
