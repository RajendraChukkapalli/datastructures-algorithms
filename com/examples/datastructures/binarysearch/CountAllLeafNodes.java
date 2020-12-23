package com.examples.datastructures.binarysearch;

import java.util.Stack;

public class CountAllLeafNodes {

	public static void main(String[] args) {
		int[] intSortedArray  = new int[]{-1, 0, 10,20,30,40,50,60,70,80,90,100};
		BinaryTreeNode  node = BSTInOrderTraversal.buildBST(intSortedArray, 0, intSortedArray.length-1);
		countAllLeafs(node);
		System.out.println(countAllLeafsRecursive(node));
	}

	/**
	 * Counting all leafs using iterative approach.
	 * 
	 * @param node 
	 */
	private static void countAllLeafs(BinaryTreeNode node) {

		if (node == null) return;
		int count = 0;
		Stack<BinaryTreeNode> nodStack = new Stack<BinaryTreeNode>();
		
		while (true) {			
				while (node != null) {
					nodStack.push(node);
					node = node.left;
				}
				if (nodStack.isEmpty()) break;
				node = nodStack.pop();
				System.out.print(node.value + " ");
				if (isLeaf(node)) ++count;
				node = node.right;
		}
		System.out.println();
		System.out.println(count);
	}

	private static boolean isLeaf(BinaryTreeNode temp) {
		return (temp != null && temp.left == null && temp.right == null);
	}
	
	
	/**
	 * Counting all leafs using recursive approach.
	 * 
	 * @param node
	 */
	private static int countAllLeafsRecursive(BinaryTreeNode node) {

		int count = 0;
		if (node == null) return 0;
		if (isLeaf(node)) return 1;
		count = countAllLeafsRecursive(node.left) + countAllLeafsRecursive(node.right);
		return count;
	}
}
