package com.examples.bst;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		
		int[] intSortedArray  = new int[]{-1, 0, 10,20,30,40,50,60,70,80,90,100};
		BinaryTreeNode  node = BSTInOrderTraversal.buildBST(intSortedArray, 0, intSortedArray.length-1);
		// display level order traversal
		displayLevelOrderTraversal(node);
		System.out.println();
		// calculate height of the tree
		System.out.println(height(node));
	}

	/**
	 * Height of the tree 
	 * 
	 * @param node
	 * @return
	 */
	private static int height(BinaryTreeNode node) {
		if (node == null) return 0;
		int leftHeight  = height(node.left);
		int rightHeight  = height(node.right);
		
		if (leftHeight > rightHeight) {
			return leftHeight + 1;
		} else {
			return rightHeight + 1;
		}
	}

	/**
	 * Level order traversal 
	 * 
	 * @param node
	 */
	private static void displayLevelOrderTraversal(BinaryTreeNode node) {
		if (node == null) return;
		Queue<BinaryTreeNode> queueOfNodes = new LinkedList<>();
		queueOfNodes.add(node);  // add to queue
		while (!queueOfNodes.isEmpty()) {
			node = queueOfNodes.poll();
			System.out.print(node.value + " ");
			
			if (node.left != null) {
				queueOfNodes.add(node.left);
			}
			if (node.right != null) {
				queueOfNodes.add(node.right);
			}
		}
	}
}
