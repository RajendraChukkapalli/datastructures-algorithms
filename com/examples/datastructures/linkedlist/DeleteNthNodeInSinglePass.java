package com.examples.datastructures.linkedlist;

/**
 * Delete a node in single pass. 
 * 
 */
public class DeleteNthNodeInSinglePass {

	public static void main(String[] args) {
		
		LinkedList linkedList = NodesUtil.constructLinkedList();
		// delete node with value 4
		deleteNode(linkedList, 4L);
		// display linked list after delete
		Node curr1 = linkedList.getHead();
		while (curr1 != null) {
			System.out.print(curr1.data + " ");
			curr1 = curr1.next;
		}
		
		removeElements(linkedList, 4L);
	}

	private static void deleteNode(LinkedList linkedList, long l) {
		
		Node curr = linkedList.getHead();
		Node prev = null;
		while (curr !=null) {
			if (curr.data == l) {
				curr = curr.next;
			} else {
				prev = curr;
				curr = curr.next;
			}
		}
	}
	
	
public static LinkedList removeElements(LinkedList linkedList, long l) {
        
	 if (linkedList == null) return null;
     Node current = linkedList.getHead();
     Node prev = null;
     while (current != null) { 
         if (current.data == l) {
             current = current.next;
         } else {
        	 prev = current;
        	 current = current.next;
         }
     }
     linkedList.head = current;
     return linkedList;
    }
}
