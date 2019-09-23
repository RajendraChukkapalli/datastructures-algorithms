package com.examples.datastructures.linkedlist;

public class Node {
	
	public Long data;
	public Node next;
	
	public Node(Long data) {
		this.data = data;
		this.next = null;
	}
	
	public Long getData() {
		return data;
	}
	public void setData(Long data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
