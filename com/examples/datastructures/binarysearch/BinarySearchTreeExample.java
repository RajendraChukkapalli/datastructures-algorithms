package com.examples.datastructures.binarysearch;

/**
 * Binary search tree is a variation of a Binary Tree.
 * - it has one root node. each node (including) root, can have 3 nodes 1. left 2. right
 * - the node which does not have any childs is called as "leaf" node
 * - the nodes with the same parent are siblings 
 * 
 * Difference between Binary Tree and Binary Search Tree is 
 * In Binary Search Tree - 
 * 
 * all the elements on the left side are less than the value of root node
 * all the elements on right side are greater than the value of the root node. 
 *
 */
public class BinarySearchTreeExample {

	public static void main(String[] args) {
		
		TreeNode tn  = new TreeNode (10); 
		
		TreeNode tn1  = new TreeNode (7); 
		TreeNode tn2  = new TreeNode (3); 
		TreeNode tn3  = new TreeNode (8); 
		
		TreeNode tn4  = new TreeNode (12); 
		TreeNode tn5  = new TreeNode (11); 
		TreeNode tn6  = new TreeNode (14); 
		
		tn.setLeftChild(tn1);
		tn.setRightChild(tn4);

		tn1.setLeftChild(tn2);
		tn1.setRightChild(tn3);
		
		tn4.setLeftChild(tn5);
		tn4.setRightChild(tn6);
		
		TreeNode found = tn.find(new Integer(8));
		System.out.println("end => " + found.getData());
		
		tn.insert(new Integer(13));
		System.out.println("----------------------");
		System.out.println("end => " + tn.find(new Integer(13)).getData());
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = tn;
		tree.delete(11);
	}
}


class BinarySearchTree {
	
	public  TreeNode root;
	
	public TreeNode find(Integer data) {
		if (root != null ) {
			System.out.println("root");
			return root.find(data);
		}
		return null;
	}
	public void insert(Integer data) {
		
		if (root == null) {
			this.root = new TreeNode(data);
		} else {
			root.insert(data);
		}
	}
	
	/**
	 * BST can be traversed either with iterative or recursive approach. 
	 * For traversal, recursive is the best approach and it looks clean.
	 * 
	 * For delete, we need to use the iterative approach as we need to remember
	 * the previous node information. this is required to maintain the property of
	 * the binary search tree. (which is all left nodes are smaller than the root and 
	 * all the right nodes are greater than the root node).
	 * 
	 * Delete can be of the following 3 use cases
	 * 
	 * 1. node to be deleted is a leaf node. 
	 * 2. node to be deleted has 1 child.
	 * 3. node to be deleted has 3 children.
	 * 
	 * @param data
	 */
	public void delete(Integer data) {
		
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;

		if (current == null)
			return; // tree is empty
		
		// identify whether the node to be of left child or right child.
		// check parent = current, this is to retain the "parent" and "child" relation in the tree.
		while (current != null && current.getData() != data) {
			parent = current;
			if (data < current.getData()) {
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}
		
		
		// this is case 1 - 
		// left child is null and right child is null - which means it is a leaf node.
		if (current.getLeftChild() == null && current.getRightChild() == null) {
			if (current == root) {
				root = null; // no elements in tree now
			} else {
				if (isLeftChild)
					parent.setLeftChild(null);
				else
					parent.setRightChild(null);
			}
		}
		
		// case 2:  now you identified whether this can be a left child or right child.
		// left child can be null
		if (current.getLeftChild() == null) {
			                	
		
		// right child can be null
		} else if (current.getRightChild() == null) {
			
		}
	}
}


class TreeNode {

	private Integer data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public TreeNode(Integer data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public Integer getData() {
		return data;
	}
	
	
	/**
	 * Check the root node 
	 * if the data is greater than root node 
	 *     move to right side 
	 *     check if the right node is null 
	 *            if the right node is null, add the right node
	 *     if the right node is not null 
	 *            it can be on the left side oor right side (call the recursive method) on the right node.
	 *            
	 * @param data
	 */
	public void insert (Integer data) {
		
		if (this.data >= data ) {
			System.out.println("insert left");
			if (this.leftChild == null) {
				this.leftChild = new TreeNode(data);
			} else {
				this.getLeftChild().insert(data);
			}
		} else {
			System.out.println("insert right");
			if (this.rightChild == null) {
				this.rightChild = new TreeNode(data);
			} else {
				this.getRightChild().insert(data);
			}
		}
	}
	
	public TreeNode find (Integer data) { 
		
		if (this.getData().equals(data)) {
			System.out.println("data is equal");
			return this;
		}
		
		if (data < this.data && leftChild.data != null) {
			System.out.println("left");
			return leftChild.find(data);
		}
		
		if (rightChild.data != null) {
			System.out.println("right");
			return rightChild.find(data);
		}
		return null;
	}
	

}