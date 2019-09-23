package com.examples.datastructures.linkedlist;

/**
 * a. create a linked list
 * b. delete a node from linked list
 * c. delete a node from linked list in nth pass
 * d. check whether the linked list is circular or not
 * e. add an item to the linked list
 * f. create a double linked list
 * g. find duplicate elements in linked list
 * h. add element at specific position
 * i. convert the linked list into array list
 */
public class LinkedListExamples {

	public static void main(String[] args) {
		
		LinkedListExamples example = new LinkedListExamples();
		// create a linked list and add elements to it
		LinkedList linkedList = new LinkedList(null);
		example.addItems(linkedList, 10L);
		example.addItems(linkedList, 30L);
		example.addItems(linkedList, 40L);
		example.addItems(linkedList, 50L);
		System.out.println("linked list = " + linkedList);
		
		// find length of the list
		// int length = example.getLength(linkedList);
		// System.out.println("size of the linked list = " + length);
		
		// delete an element from linked list
		// deleting an element means "find" an element and "delete" 
		example.deleteANode(linkedList, 30L);
		
		// check whether the given linked list is circular or not ?
		//LinkedList circularList = makeItCircular ( linkedList);
		//boolean isCircular = isCircular (linkedList);
		//System.out.println(isCircular);
		
	}

	
	private static LinkedList makeItCircular(LinkedList linkedList) {
		Node current = linkedList.head;
		Node temp = null;
		while (current.getNext() != null) {
			if (current.next != null) {
				current = current.next;
				if (current.getNext() == null) {
					temp = current;
					break;
				}
			}
		}
		if (temp != null) {
			temp.next = linkedList.head;
		}
		System.out.println("temp linked list = " + temp);
		linkedList.head = temp;
		return linkedList;
	}


	private static boolean isCircular(LinkedList linkedList) {
		
		Node first = linkedList.head;
		Node second = linkedList.head;
		
		while (true) {
			Node firstNode = first.next;
			Node secondNode = second.next.next;
			
			 if (firstNode.data == secondNode.data) {
		            return true;
		        }
		}
	}

	/**
	 * find an element and delete it. 
	 * @param l 
	 */
	private void deleteANode(LinkedList linkedList, long inputData) {
		
		Node previous = null;
		Node current = linkedList.getHead();
		
		while (current != null) {       	
			if (current.data != null && 
					current.data.equals(inputData))  {
					 Node next = current.next;
					 previous.setNext(next); 
					 break;
					} else {
						previous = current; 
						current = current.next; 
					}
			}
			System.out.println("linked list = " + linkedList);
	}

	/**
	 * Iterate the list and add the count
	 * 
	 * @param linkedList
	 */
	private int getLength(LinkedList linkedList) {
		
		LinkedList temp = linkedList;

		int count  = 0;
		while (temp.getHead() != null) {
			count = count + 1;
			System.out.println(temp.getHead().getData());
			temp.head = temp.getHead().getNext();
		}
		return count;
	}

	/**
	 * Check if there are any elements in the linked list and add.
	 * @param linkedList
	 */
	private void addItems (LinkedList linkedList, Long data) { 
		
		 Node node = new Node (data);
		 node.setNext(linkedList.getHead());
		 linkedList.setHead(node); 	
	}
}
