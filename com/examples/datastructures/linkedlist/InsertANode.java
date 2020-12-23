package com.examples.datastructures.linkedlist;

/**
 * Insert a node at the beginning / middle and end
 *
 */
public class InsertANode {

	public static void main(String[] args) {
		
		SinglyLinkedListNode list2 = new SinglyLinkedListNode(2);
		list2.next = new SinglyLinkedListNode(3);
		list2.next.next = new SinglyLinkedListNode(6);
		list2.next.next.next = new SinglyLinkedListNode(9);
		
		SinglyLinkedListNode new_list1 = insertAtTheBeginning(list2, 10);
		SinglyLinkedListNode new_list2 = insertAtTheEnd(list2, 12);
		System.out.println(new_list1.toString());
		System.out.println(new_list2.toString());

	}

	private static SinglyLinkedListNode insertAtTheBeginning(SinglyLinkedListNode list2, int newNodeData) {
		
		SinglyLinkedListNode new_node = new SinglyLinkedListNode(newNodeData);
		new_node.next =  list2;
		
		return new_node;
	}

	private static SinglyLinkedListNode insertAtTheEnd(SinglyLinkedListNode list2,  int newNodeData) {
		
		SinglyLinkedListNode head = list2;
		while (list2.next != null) {
			list2 = list2.next;
		}
		SinglyLinkedListNode new_node = new SinglyLinkedListNode(newNodeData);
		list2.next =  new_node;
		return head;
	}
}
