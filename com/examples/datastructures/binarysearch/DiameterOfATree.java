package com.examples.datastructures.binarysearch;
/**
 * Diameter of tree can be 
 * 
 * 1. left height of the tree + right height of the tree + 1 (root)
 * 2. Not all the trees are balanced. sometimes it might be unbalanced
 * 	
 * 		
 *
 */
public class DiameterOfATree {

	public static void main(String[] args) {
		int[] intSortedArray  = new int[]{-1, 0, 10,20,30,40,50,60,70,80,90,100};
		BinaryTreeNode  node = BSTInOrderTraversal.buildBST(intSortedArray, 0, intSortedArray.length-1);
		System.out.println(diameterOfATree(node));
	}

	private static int diameterOfATree(BinaryTreeNode node) {
		
		if (node == null) return 0;
		int lheight = height(node.left);
		int rheight = height(node.right);
		
		int ldiameter = diameterOfATree(node.left);
		int rdiameter = diameterOfATree(node.right);
		
		int result = Math.max(lheight+rheight+1, Math.max(ldiameter, rdiameter));
		return result;
	}

	private static int height(BinaryTreeNode node) {
		if (node == null) return 0;
		
		int lh = height(node.left) + 1;
		int rh = height(node.right) + 1;
		
		return Math.max(lh, rh);
	}

}
