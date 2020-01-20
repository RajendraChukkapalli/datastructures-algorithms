package com.examples.datastructures.binarysearch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class AllPaths {

	public static void main(String[] args) {

		int[] intSortedArray = new int[] { -1, 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		BinaryTreeNode node = BSTInOrderTraversal.buildBST(intSortedArray, 0, intSortedArray.length - 1);
		// ArrayList<String> paths = displayAllPaths(node);

		List<String> newPaths = new ArrayList<>();
		// dfs
		dfs(node, "", newPaths);
		System.out.println(newPaths);
	}

	/**
	 * In-order traversal
	 * 
	 * left - root - right
	 * 
	 * @param node
	 * @return
	 */
	private static ArrayList<String> displayAllPaths(BinaryTreeNode node) {

		if (node == null)
			return new ArrayList<String>();
		Stack<BinaryTreeNode> nodStack = new Stack<BinaryTreeNode>();
		Stack<Integer> numStack = new Stack<Integer>();

		while (node != null || nodStack.size() > 0) {
			while (node != null) {
				nodStack.push(node);
				numStack.push(node.value);
				node = node.left;
			}
			// now you are at the left-most node
			if (leafNode(node)) {
				// path
				printPath(numStack);
				numStack.pop();
			}
			node = nodStack.pop();
			System.out.print(node.value+ " ");
			node = node.right;
		}
		return null;
	}

	private static void printPath(Stack<Integer> numStack) {

		if (numStack != null) {
			Iterator<Integer> iter = numStack.iterator();
			while (iter.hasNext()) {
				System.out.print(iter.next() + " ");
			}
			System.out.println();
		}

	}

	private static boolean leafNode(BinaryTreeNode node) {
		if (node != null && node.left == null && node.right == null) {
			return true;
		}
		if (node == null)
			return true;
		return false;
	}

	/**
	 * 
	 * @param node
	 * @param current
	 * @param paths
	 */
	public static void dfs(BinaryTreeNode node, String current, List<String> paths) {

		current += node.value;
		if (node.left == null && node.right == null) {
			paths.add(current);
			return;
		}
		if (node.left != null) {
			dfs(node.left, current + "->", paths);
		}

		if (node.right != null) {
			dfs(node.right, current + "->", paths);
		}
	}

}
