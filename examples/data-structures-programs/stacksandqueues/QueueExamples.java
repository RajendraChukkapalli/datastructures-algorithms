package com.examples.datastructures.stacksandqueues;

/**
 * Array backed queue implementation. 
 *
 */
public class QueueExamples {

	public static void main(String[] args) {
		
		MyQueue myQueue = new MyQueue();
		
		myQueue.enqueue(10);
		myQueue.enqueue(11);
		myQueue.enqueue(12);
		
		myQueue.dequeue();
		
		myQueue.enqueue(13);
		myQueue.enqueue(14);
		myQueue.enqueue(15);
		
		myQueue.enqueue(16);
		myQueue.enqueue(17);
		myQueue.enqueue(18);
		myQueue.enqueue(19); 
		
		myQueue.enqueue(20); 
		myQueue.enqueue(21); 
		myQueue.enqueue(22); 
		
		boolean found =  myQueue.peek(25);
		System.out.println(found);
	}
}


class MyQueue {
	
	Integer[]   intArray = null; 
	int intArrayIndex = 0;
	
	MyQueue() {
		super();
		intArray = new Integer[10];
	}
	
	public void enqueue(int element) { 
		
	 // check whether index is greater than the size of the array length
	 if (intArrayIndex >=  intArray.length ) { 
		 // expand the array;
		 Integer[] tempArray = new Integer[intArray.length * 2];
		 // copy the elements to temp array
		 for (int i=0; i<intArrayIndex; i++  ) {
			 tempArray[i] = intArray[i];
		 }
		 // assign the temp array to old array
		 intArray = tempArray;
	 } 
	 intArrayIndex = addElement(intArray, intArrayIndex, element);
	 System.out.println("intArrayIndex =>"  + intArrayIndex);
	}
	
	private int addElement(Integer[] intArray, int intArrayIndex, int element) {
		intArray[intArrayIndex] = element;
		intArrayIndex += 1;
		return intArrayIndex;
		
	}
	
	/**
	 * Remove the element from the array beginning 
	 * and move the elements by 1 up and reduce the no of elements size in array
	 * 
	 * @param element
	 */
	public void dequeue() {  
		for (int i=1; i < intArray.length; i++) {
			intArray[i-1] = intArray[i];
 		}
		intArrayIndex = intArrayIndex - 1;
	}

	/**
	 * Naviagte the array and find whether the element exists or not
	 * 
	 * @param element
	 */
	public boolean peek (int element) {
		
		for (int i=1; i < intArray.length; i++) {
			if (intArray[i] != null && intArray[i] == element) {
				return true;
			};
 		}
		return false;
	}
}