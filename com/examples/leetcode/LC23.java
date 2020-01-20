package com.examples.leetcode;

import java.util.PriorityQueue;

/**
 * https://www.youtube.com/watch?v=zLcNwcR6yO4
 * 
 * Merge K sorted linked lists
 *
 */
public class LC23 {

	public static void main(String[] args) {
		
		
	}
	
	private ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (ListNode node : lists) {
			while (node != null) {
				minHeap.add(node.val);
				node = node.next;
			}
		}
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		while (!minHeap.isEmpty()) {
			head.next = new ListNode(minHeap.remove());
			head = head.next;
		}
		return dummy.next;
	}
}