package com.examples.datastructures.linkedlist;

public class NodesUtil {
	
	public static LinkedList constructLinkedList() {
		
		LinkedList linkedList = new LinkedList(null);
		
		for (int i=0; i< 10; i++) {
			Node node2 = null;
			if (i%2 == 0) {
				node2  = new Node(Long.valueOf(4));
			} else {
				node2  = new Node(Long.valueOf(i));
			}
			
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
