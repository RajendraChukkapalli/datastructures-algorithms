package com.examples.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.examples.datastructures.binarysearch.BinaryTreeNode;

//Java program for different tree traversals 

/* Class containing left and right child of current 
node and key value*/
class Node 
{ 
	int key; 
	Node left, right; 

	public Node(int item) 
	{ 
		key = item; 
		left = right = null; 
	} 
} 

class BinaryTree 
{ 
	// Root of Binary Tree 
	Node root; 

	BinaryTree() 
	{ 
		root = null; 
	} 

	/* Given a binary tree, print its nodes according to the 
	"bottom-up" postorder traversal. */
	void printPostorder(Node node) 
	{ 
		if (node == null) 
			return; 

		// first recur on left subtree 
		printPostorder(node.left); 

		// then recur on right subtree 
		printPostorder(node.right); 

		// now deal with the node 
		System.out.print(node.key + " "); 
	} 

	/* Given a binary tree, print its nodes in inorder*/
	void printInorder(Node node) 
	{ 
		if (node == null) 
			return; 

		/* first recur on left child */
		printInorder(node.left); 

		/* then print the data of node */
		System.out.print(node.key + " "); 

		/* now recur on right child */
		printInorder(node.right); 
	} 

	/* Given a binary tree, print its nodes in preorder*/
	void printPreorder(Node node) 
	{ 
		if (node == null) 
			return; 

		/* first print data of node */
		System.out.print(node.key + " "); 

		/* then recur on left sutree */
		printPreorder(node.left); 

		/* now recur on right subtree */
		printPreorder(node.right); 
	} 

	// Wrappers over above recursive functions 
	void printPostorder() {	 printPostorder(root); } 
	void printInorder() {	 printInorder(root); } 
	void printPreorder() {	 printPreorder(root); } 
	
	

	// Driver method 
	public static void main(String[] args) 
	{ 
		BinaryTree tree = new BinaryTree(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
//		tree.root.right.right = new Node(7); 
//		tree.root.right.right.right = new Node(9); 
//		tree.root.right.right.right.right = new Node(11); 

		System.out.println("Preorder traversal of binary tree is "); 
		tree.printPreorder(); 

		System.out.println("Preorder traversal of binary tree is "); 
		tree.preOrderTraversal(tree.root); 
		
		System.out.println("\nInorder traversal of binary tree is "); 
		tree.printInorder(); 

		System.out.println("\nPostorder traversal of binary tree is "); 
		tree.printPostorder(); 
		System.out.println(" ");
		
		levelOrderTraversal(tree.root);
		
		inOrderTraversal(tree.root);
		
		lca(tree.root, new Node(4), new Node(5));
	} 
	
	private static  void levelOrderTraversal(Node node) {
		if (node == null) return;
		Queue<Node> qNodes = new LinkedList<Node>();
		qNodes.add(node);
		int count = 0;
		while (!qNodes.isEmpty()) {
			Node t = qNodes.poll();
			System.out.print(t.key + " ");
			if (t.left != null) {
				qNodes.add(t.left);
				if(isLeafNode(t.left)) {
					count++;
				};
			}
			if (t.right != null) {
				qNodes.add(t.right);
				if(isLeafNode(t.right)) {
					count++;
				};
			}
		}
		System.out.println();
		System.out.println("count ===> " + count);
	}
	
	private static boolean isLeafNode(Node right) {

		if (right !=null && (right.left == null && right.right == null)) {
			return true;
		}
		return false;
	}

	// left - root - right
	private static  void inOrderTraversal(Node node) { 
		
		Stack<Node> s = new Stack<Node>(); 
        Node curr = node; 
  
        // traverse the tree 
        while (curr != null || s.size() > 0) 
        { 
  
            /* Reach the left most Node of the 
            curr Node */
            while (curr !=  null) 
            { 
                /* place pointer to a tree node on 
                   the stack before traversing 
                  the node's left subtree */
                s.push(curr); 
                curr = curr.left; 
            } 
  
            /* Current must be NULL at this point */
            curr = s.pop(); 
  
            System.out.print(curr.key + " "); 
  
            /* we have visited the node and its 
               left subtree.  Now, it's right 
               subtree's turn */
            curr = curr.right; 
        } 
    } 
	
	  private static int lca(Node root, Node a, Node b) {
		  
		  Node curr = root;
		  int aNode = a.key;
		  int bNode = b.key;
		  
		  while (curr != null) {
			  

			  if (aNode > curr.key && bNode > curr.key) {
				  
				  curr = curr.right;
			  } else  if (aNode < curr.key && bNode < curr.key)  {
				  
				  curr = curr.left;
			  } else {
				  System.out.println(curr.key);
			  }
		  }
		return 0;
	  } 
	  
	  
		// left - root - right
		private   void preOrderTraversal(Node node) { 
			
			if (node == null) return;
			
			Queue<Node> s = new LinkedList<Node>(); 
	        Node curr = node; 
	        s.add(curr);
	  
	        // traverse the tree 
//	        while (!s.isEmpty()) 
//	        { 
//	            curr = s.poll(); 
//	            System.out.print(curr.key + " "); 
//	            
//	            while (curr != null) {
//	            	
//	            	if (curr.left != null) {
//	            		 s.add(curr.left);
//	            	} 
//	            	if (curr.right != null) {
//	            		 s.add(curr.right);
//	            	} 
//	            }
//	        } 
	    } 
	  
} 
