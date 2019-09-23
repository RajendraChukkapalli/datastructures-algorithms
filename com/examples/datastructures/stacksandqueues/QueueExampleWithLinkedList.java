package com.examples.datastructures.stacksandqueues;

import com.examples.datastructures.linkedlist.LinkedList;
import com.examples.datastructures.linkedlist.Node;

/** 
 * Linked List based queue implementation
 * 
 */
public class QueueExampleWithLinkedList {

	public static void main(String[] args) {
		MyQueue2 myQueue2 = new MyQueue2();
		myQueue2.enqueue(10L);
		myQueue2.enqueue(11L);
		myQueue2.enqueue(12L);
		myQueue2.dequeue();
		myQueue2.enqueue(12L);
		myQueue2.enqueue(12L);
		myQueue2.enqueue(12L);
		myQueue2.enqueue(12L);
		myQueue2.enqueue(100L);
	}
}

class MyQueue2 {
	
	LinkedList list = new LinkedList(null); 
	public void enqueue(Long element) { 
		Node node = null;
		if (list.head == null) {
			node = new Node (element);
			node.next  = null;
			list.setHead(node);
			return;
		}
		addNodeToList(list.getHead(), element);
	}
	

	private void addNodeToList(Node node2, Long nodeData) {
	   while  (node2.next != null) {
		   node2  = node2.getNext();
	   } 
	   Node node = new Node(nodeData);
	   node.next  = null;
	   node2.setNext(node);
	}



	/**
	 * Remove the element from the array beginning 
	 * and move the elements by 1 up and reduce the no of elements size in array
	 * 
	 * @param element
	 */
	public void dequeue() {  
		
	}

	/**
	 * Naviagte the array and find whether the element exists or not
	 * 
	 * @param element
	 */
	public boolean peek (int element) {
		return false;
	}
}