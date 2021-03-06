package com.examples.test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

//A Java program to find value of the 
//deepest node in a given binary tree 
class GFG 
{ 
	
//A tree node with constructor 
	static class Node 
	{ 
		int data; 
		Node left, right; 
		
		// constructor 
		Node(int key) 
		{ 
			data = key; 
			left = null; 
			right = null; 
		} 
}; 

//Utility function to find height 
//of a tree, rooted at 'root'. 
static int height(Node root) 
{ 
	if(root == null) return 0; 
		
	int leftHt = height(root.left); 
	int rightHt = height(root.right); 
		
	return Math.max(leftHt, rightHt) + 1; 
} 

//levels : current Level 
//Utility function to print all 
//nodes at a given level. 
static void deepestNode(Node root, 
						int levels) 
{ 
	if(root == null) return; 
	
	if(levels == 1) 
	System.out.print(root.data + " "); 
	
	else if(levels > 1) 
	{ 
		deepestNode(root.left, levels - 1); 
		deepestNode(root.right, levels - 1); 
	} 
} 

//Driver Codede 
public static void main(String args[]) 
{ 
	Node root = new Node(1); 
	root.left = new Node(2); 
	root.right = new Node(3); 
	root.left.left = new Node(4); 
	root.right.left = new Node(5); 
	root.right.right = new Node(6); 
	root.right.left.right = new Node(7); 
	root.right.right.right = new Node(8); 
	root.right.left.right.left = new Node(9); 
	
	// Calculating height of tree 
	int levels = height(root); 
	
	// Printing the deepest node 
	deepestNode(root, levels); 
	
	deepestNodeUsingLevelOrderTraversal(root);
}

private static void deepestNodeUsingLevelOrderTraversal(Node root) {
	
	List<Integer> list = new ArrayList<>();
	Queue<Node> q = new ArrayDeque<>();
	if (root != null) {
		q.add(root);
	}
	while (!q.isEmpty()) {
		Node node = q.poll();
		if (node != null) list.add(node.data);
		if (node.left != null) {
			q.add(node.left);
		}
		if (node.right != null) {
			q.add(node.right);
		}
	}
	System.out.print(list.get(list.size()-1));
} 
} 
