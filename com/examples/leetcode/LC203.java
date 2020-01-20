package com.examples.leetcode;

public class LC203 {

	public static void main(String[] args) {
		
		// [1,2,6,3,4,5,6]
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(6);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(4);
		ListNode node6 = new ListNode(5);
		ListNode node7 = new ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		
		ListNode node = removeElements(node1, 6);
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
	
	/**
	 * why do you need a dummy? 
	 * 
	 * it is needed when you want remove the element at the beginning.
	 * 
	 * 
	 * @param head
	 * @param val
	 * @return
	 */
	public static ListNode removeElements(ListNode head, int val) { 
		ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode n = dummy;
        while (n.next != null) {
            if (n.next.val == val) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }        
        return head;
	}
}

 class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}
