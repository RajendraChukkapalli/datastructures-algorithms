package com.examples.datastructures.linkedlist;

public class NodesUtil {
	
	public static LinkedList constructLinkedList() {
		
		LinkedList linkedList = new LinkedList(null);
		
		for (int i=0; i< 10; i++) {
			Node node2 = new Node(new Long(i));
			node2.setNext(linkedList.getHead());
			linkedList.setHead(node2);
		}
		
		if (linkedList != null) {
			Node node = linkedList.head;
			while (node != null) {
				System.out.println(node.data);
				node = node.next;
			}
		}
		return linkedList;
	}
	
	public static void main(String args[]) {
		constructLinkedList();
	}
}
