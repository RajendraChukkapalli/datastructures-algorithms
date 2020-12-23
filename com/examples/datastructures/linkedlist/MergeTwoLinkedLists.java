package com.examples.datastructures.linkedlist;

public class MergeTwoLinkedLists {

	public static void main(String[] args) {
		
		SinglyLinkedListNode list1 = new SinglyLinkedListNode(1);
		list1.next = new SinglyLinkedListNode(5);
		list1.next.next = new SinglyLinkedListNode(7);

		SinglyLinkedListNode list2 = new SinglyLinkedListNode(2);
		list2.next = new SinglyLinkedListNode(3);
		list2.next.next = new SinglyLinkedListNode(6);
		list2.next.next.next = new SinglyLinkedListNode(9);
		
		SinglyLinkedListNode result = mergeLists(list1, list2);

	}

	
	static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode m = head1;
        SinglyLinkedListNode n = head2;

        if(m == null) {
            return n;
        }
        if (n == null) {
            return m;
        }

        SinglyLinkedListNode result = new SinglyLinkedListNode(-1);
        SinglyLinkedListNode mn = result;
        while (m != null && n != null) {
             if (m.data < n.data) {
                mn.next = m;
                m = m.next;
             } else {
                mn.next = n;
                n = n.next;
             }
              mn = mn.next;
        }
        if (m == null) {
            mn.next = n;
        } else {
            mn.next = m;
        }
        return result.next;
    }
}
