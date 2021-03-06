package com.examples.datastructures.linkedlist;

/**
 * You can do with the help of stack 
 * Or in iterative fashion
 * 
 * With stack - you need an extra space of O(n) 
 * 
 */
public class ReverseALinkedList {

	public static void main(String[] args) {
		
		LinkedList linkedList = NodesUtil.constructLinkedList();
		linkedList = reverseLinkedList(linkedList);
		System.out.println();
		Node curr1 = linkedList.getHead();
		while (curr1 != null) {
			System.out.print(curr1.data + " ");
			curr1 = curr1.next;
		}
		System.out.println();
		// Print linked list recursively
		 recursivePrint(linkedList.head);
	}

	/**
	 * Iteration:
	 * 
	 * 		1. Check if the curr is null ?
	 * 		2. Assign the current.next to next
	 * 		3. make the current.next to null (tail) which is prev here
	 * 		4. assign current to prev 
	 * 		5. assign next to current
	 * 
	 * @param linkedList
	 * @return
	 */
	private static LinkedList reverseLinkedList(LinkedList linkedList) {
		
		Node node =  linkedList.head;
		
		Node prev = null;
		Node curr = node;
		Node next = null;
		
		while (curr != null) {
			next = curr.next; // retain the link to next node
			curr.next = prev; // now point the curr.next to prev
			prev = curr; // assign curr to prev
			curr = next; // move the curr node to next node. 
		}
		node = prev;
		linkedList.head = node;
		return linkedList;
	}
	
	
	/**
	 * Print linked list in recursive
	 * 
	 * @param linkedList
	 */
	private static void recursivePrint(Node n) {
		if (n.next == null) {
			System.out.print(n.data + " ");
			return;
		}
		System.out.print(n.data + " ");
		recursivePrint(n.next);
	}
}
