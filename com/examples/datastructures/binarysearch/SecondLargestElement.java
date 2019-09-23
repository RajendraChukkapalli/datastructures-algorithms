package com.examples.datastructures.binarysearch;

/**
 * 2 use cases
 * 
 * 1. In BST, all the elements less than root are on left side
 * 2. all the elements greater than root are on right side 
 * 3.  
 *
 */
public class SecondLargestElement {

	public static void main(String[] args) {
		int[] intSortedArray  = new int[]{-1, 0, 10,20,30,40,50,60,70,80,90,100};
		BinaryTreeNode node =  BSTInOrderTraversal.buildBST(intSortedArray, 0, intSortedArray.length-1);
		System.out.println(findLargest(node));
		System.out.println(findSecondLargest(node));
	}
	
	
	/**
	 * if the right node is null, which means the second largest node
	 * is on the left side
	 * 
	 * @param node
	 * @return
	 */
	private static int findSecondLargest(BinaryTreeNode node) {
		
		 // if the right node is null 
		//  and if the left node is not null
		//  largest node is "second largest node"
		 if (node.left != null && node.right == null) {
		        return findLargest(node.left);
		  }
		 // if the right node is not null 
		 // and right nodes left node is null and right node is null
		 // then the current node is second largest node
		  if (node.right != null
		            && node.right.left == null
		            && node.right.right == null) {
		        return node.value;
		  }
		  return findSecondLargest(node.right);
	}


	/** 
	 * Assuming the tree contains the max value is always on the right
	 * 
	 * @param rootNode
	 * @return
	 */
	private static int findLargest(BinaryTreeNode rootNode) {
		if (rootNode == null) {
			throw new IllegalArgumentException("Tree must have at least 1 node");
		}
		if (rootNode.right != null) {
			return findLargest(rootNode.right);
		}
		return rootNode.value;
	}
}
