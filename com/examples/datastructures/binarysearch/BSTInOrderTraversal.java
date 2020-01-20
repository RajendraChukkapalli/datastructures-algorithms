package com.examples.datastructures.binarysearch;

import java.util.Stack;

public class BSTInOrderTraversal {

	public static void main(String[] args) {
		int[] intSortedArray  = new int[]{-1, 0, 10,20,30,40,50,60,70,80,90,100};
		BinaryTreeNode node =  buildBST(intSortedArray, 0, intSortedArray.length-1);
         displayBSTInOrder(node);
		System.out.println("--------------");
		// build tree iteratively
		BinaryTreeNode node2 = null;
		for (int i: intSortedArray) {
			node2 = buildBSTIterative(node2,i);
		}
		System.out.println("in order recursion ->");
		displayBSTInOrder(node2);
		System.out.println();
		System.out.println("in order iterative ->");
		displayBSTInOrderIterative(node2);
		System.out.println();
		System.out.println("post order recursion ->");
		displayBSTPostOrder(node);
	}

	/**
	 * In order traversal 
	 * 
	 * @param node
	 */
	private static void displayBSTInOrder(BinaryTreeNode node) {
		if (node == null) return;
		displayBSTInOrder(node.left);
		System.out.print(node.value + " ");
		displayBSTInOrder(node.right);
	}
	
	
	private static void displayBSTPostOrder(BinaryTreeNode node) {
		if (node == null) return;
		displayBSTInOrder(node.left);
		displayBSTInOrder(node.right);
		System.out.print(node.value + " ");
	}
	
	
	/**
	 * Iterative traversal (in-order traversal)
	 */
	private static void displayBSTInOrderIterative(BinaryTreeNode node) {
		if (node == null) return;
		Stack<BinaryTreeNode> nodStack = new Stack<BinaryTreeNode>();
		
		while (node != null || nodStack.size() > 0) {
			while  (node != null) {
				nodStack.push(node);
				node = node.left;
			} 
			node = nodStack.pop();
			System.out.print(node.value+ " "); 
			node = node.right;
		}
	}
	
	/**
	 * Binary search tree - 
	 * 
	 * @param intSortedArray
	 * @return
	 */
	public static BinaryTreeNode buildBST(int[] intSortedArray, int start, int end) {
		
		 if (start > end) { 
	            return null; 
	      }
		 int mid = (start + end) / 2; 
		 BinaryTreeNode node = new BinaryTreeNode(intSortedArray[mid]); 
		 node.left = buildBST(intSortedArray, start, mid-1); 
		 node.right = buildBST(intSortedArray,  mid+1, end); 
		return node;
	}
	
	
	
	/**
	 * Binary search tree through iterative.
	 * 
	 * @param intSortedArray
	 * @return
	 */
	private static BinaryTreeNode buildBSTIterative(BinaryTreeNode root, int value) {
		
		if (root == null) {
			root = new BinaryTreeNode(value);
			return root;
		}
		
		BinaryTreeNode current = root;
		BinaryTreeNode parent = null;
		
		while (true) {
			parent = current;
			if (value < current.value) {
				current = current.left;
				if (current == null) {
					parent.left  = new BinaryTreeNode(value);
					break;
				} 
			} else {
				current = current.right;
				if (current == null) {
					parent.right = new BinaryTreeNode(value);
					break;
				}
			}
		}
		return root;
	}
}
