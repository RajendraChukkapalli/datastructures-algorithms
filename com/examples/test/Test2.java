package com.examples.test;

import com.examples.datastructures.binarysearch.BinaryTreeNode;

public class Test2 {

	public static void main(String[] args) {
		
		int[] binaryTree = {10,20,30,40,50,60,70,80,90,100};
		
		
		// build binary node
		BinaryNode node = buildBinaryTreeRecursively(binaryTree, 0, binaryTree.length-1);
		
		// in-order
		displayInOrder(node);

        
		// preOrder
		displayPreOrder(node);
		// postOrder
		displayPostOrder(node);
		// isBST
		// Lowest common ancestor
		// count all leaf nodes
		// mirror tree
		// level order traversal
		// find the node

	}
	
	private static void displayPostOrder(BinaryNode node) {
		// TODO Auto-generated method stub
		
	}

	private static void displayPreOrder(BinaryNode node) {
		// TODO Auto-generated method stub
		
	}

	private static void displayInOrder(BinaryNode node) {
		// TODO Auto-generated method stub
		
		if (node == null) return;
		displayInOrder(node.left);
		System.out.print(node.data + " ");
		displayInOrder(node.right);
	}

	// any recursive binary should have base condition
	// what is the base case here? 
	// if (
	public static BinaryNode buildBinaryTreeRecursively(int[] intSortedArray, int start, int end) {
		
		 if (start > end) { 
	            return null; 
	      }
		 System.out.println("start = " + start  + "  end = " + end);
		 int mid = (start + end) / 2; 
		 BinaryNode node = new BinaryNode(intSortedArray[mid]); 
		 node.left = buildBinaryTreeRecursively(intSortedArray, start, mid-1); 
		 System.out.println("==================");
		 node.right = buildBinaryTreeRecursively(intSortedArray,  mid+1, end); 
		return node;
	}


}

class BinaryNode {
	
	int data;
	BinaryNode left;
	BinaryNode right;
	
	 public BinaryNode(int value) {
	        this.data = value;
	    }
}



