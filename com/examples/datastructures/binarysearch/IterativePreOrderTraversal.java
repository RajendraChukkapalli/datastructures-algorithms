package com.examples.datastructures.binarysearch;

import java.util.Stack;

public class IterativePreOrderTraversal {

	public static void main(String[] args) {

		Node root = new Node(20);
        
        root.left = new Node (15);
        root.left.left = new Node (10);
        root.left.right =new Node (18);
        
        root.left.left.left = new Node (8);
        root.left.left.left.left = new Node (5);


        root.right = new Node (22);
        root.right.left = new Node (21);  
        root.right.right = new Node (25);
        
        
        
        printIterativePreOrderTraversal(root); 
        System.out.println();
        printIterativePreOrderTraversal2(root); 
        System.out.println();
        printIterativeInOrderTraversal(root);     
        System.out.println();
        printIterativePostOrderTraversal(root);      
	}

	/**
	 * Post order traversal is - left -> right -> root
	 * @param root
	 */
	private static void printIterativePostOrderTraversal(Node root) {
		
	}

	/**
	 * In order traversal is left -> root -> right
	 */
	private static void printIterativeInOrderTraversal(Node root) {
		
		if  (root == null) return; // base case
		Stack<Node> inOrderStack = new Stack<Node>();
		Node curr = root; 
		while (true) {
				while (curr != null) {
					inOrderStack.push(curr);
					curr = curr.left;
				}
				if (inOrderStack.isEmpty()) break;
				curr = inOrderStack.pop();
				System.out.print(curr.data + " "); 
				curr = curr.right;
		}
	}

	/**
	 * In pre order traversal, traversal starts from root, left, right
	 * @param root
	 */
	private static void printIterativePreOrderTraversal(Node root) {
		if  (root == null) return; // base case
		Stack<Node> preOrderStack = new Stack<Node>();
		preOrderStack.push(root);
		
		while (!preOrderStack.isEmpty()) {
			
			Node tempNode = preOrderStack.peek(); 
			System.out.print(tempNode.data + " ");
			preOrderStack.pop();
			
			// push right node into stack - why only right node? 
			// reason is in stack (LIFO), we need to navigate all the left nodes
			// in preprder traversal
			if (tempNode.right != null) {
				preOrderStack.push(tempNode.right);
			}
			
			// push left node into stack
			if (tempNode.left != null) {
				preOrderStack.push(tempNode.left);
			}
		}
	}
	
	/**
	 * In pre order traversal, traversal starts from root, left, right
	 * @param root
	 */
	private static void printIterativePreOrderTraversal2(Node root) {
		if  (root == null) return; // base case
		Stack<Node> preOrderStack = new Stack<Node>();
		Node tempNode = preOrderStack.push(root);
		
		while (true) {
			
			while (tempNode !=null) {
				tempNode = preOrderStack.peek(); 
				System.out.print(tempNode.data + " ");
				if (tempNode.left != null) {
					tempNode = preOrderStack.push(tempNode.left);
				} else {
					tempNode = null; 
					break;
				}
			}
			if(preOrderStack.empty()) break;
			tempNode = preOrderStack.pop();
			if (tempNode.right != null) 
				preOrderStack.push(tempNode.right);
			else 
				tempNode = null;
		}
	}
}
