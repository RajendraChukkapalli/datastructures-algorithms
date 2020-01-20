package com.examples.test;


public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArray = {-11,23,567,-99,100,34,789,25,46};
		LinkedListNode tempList = buildLinkedList(intArray);
		System.out.println(tempList.toString());
		tempList.insertNodeAtEnd(20);
		System.out.println(tempList.toString());
		
		tempList.reverse();
	}

	private static LinkedListNode buildLinkedList(int[] intArray) {
		LinkedListNode linkedList = new LinkedListNode();
		for (int element: intArray) {
			linkedList.insert(element);
		}
		return linkedList;
	}
}

class ListNode {
	 int data;
	 ListNode next;
	@Override
	public String toString() {
		return "ListNode [data=" + data + ", next=" + next + "]";
	}
}

class LinkedListNode {
	
	ListNode head;
	
	public void insert(int data) {
		ListNode node = new ListNode();
		node.data = data;
		node.next = this.head;
		this.head = node;
	}

	public void reverse() {
		
		if (this.head == null) return;
		ListNode curr = new ListNode();
		ListNode temp = this.head;
		while (temp != null) {
			curr.next = temp.next;
		}
		System.out.println(curr.toString());
		System.out.println(head.toString());
	}

	public void insertNodeAtEnd(int i) {
		ListNode curr = this.head;
		while(curr.next  != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		ListNode node = new ListNode();
		node.data = -9999;
		node.next = null;
		curr.next = node;
		System.out.println();
		System.out.println(curr.toString());
		System.out.println(head.toString());
	}

	@Override
	public String toString() {
		return "LinkedListNode [head=" + head + "]";
	}
	
	
}
