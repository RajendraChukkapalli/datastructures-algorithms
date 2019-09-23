package com.examples.datastructures.binarysearch;

/**
 * Given a binary tree, find out whether the tree is BST or not
 * 
 * BST property:
 * 
 * 1. all the left children are less than its parent
 * 2. all the right children are grester than its parent
 * 3. all the subtrees of the root (left and right) should be BST as well
 * 
 * One way to do this is recursion 
 *  
 */

  //      20
  //     /  \   
  //   15    22
  //   /\    / \
  // 10 18  21 25

 class IsBST { 
	 
	static int[] i1 = new int[7];
	static int  i1Index = 0; 

    public static void main(String args[]) {

    	IsBST t = new IsBST();

        Node root = new Node(20);
        
        root.left = new Node (15);
        root.left.left = new Node (10);
        root.left.right =new Node (18);


        root.right = new Node (22);
        // '20' - it failed for range bound solution as it is also at root node.
        root.right.left = new Node (21);  
        root.right.right = new Node (25);

       // System.out.println(t.isBST(root));
       // System.out.println(t.isBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        isBST3(root);
    }


	boolean isBST(Node root) {
		if (root == null)
			return true;
		if (isLeftTreeIsLesser(root.left, root.data) && isRightSubTreeIsGreater(root.right, root.data) 
				&& isBST(root.left)
				&& isBST(root.right)) {
			return true;
		} else {
			return false;
		}
	}

	
	private boolean isRightSubTreeIsGreater(Node root, int data) {
		if (root == null) return true;
		if ((root.data >= data) 
				&& isRightSubTreeIsGreater (root.left, data) 
				&& isRightSubTreeIsGreater (root.right, data)) {
			return true;
		} else {
			return false;
		}
	}


	private boolean isLeftTreeIsLesser(Node root, int data) {
		if (root == null) return true;
		if ((root.data <= data) 
				&& isLeftTreeIsLesser (root.left, data) 
				&& isLeftTreeIsLesser (root.right, data)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * This is a range bound solution to test 
	 * 
	 * @param node
	 * @param min
	 * @param max
	 * @return
	 */
	private boolean isBST2(Node node, int min, int max) {
		
		if (node == null) return true;
		if ((node.data >= min) 
				&& (node.data <= max)
				&& isBST2 (node.left, min, node.data) 
				&& isBST2 (node.right, node.data, max)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * In order traversal (left, root, right)
	 */
	private static void isBST3(Node root) {
		
		if (root == null) return ;
		isBST3(root.left);
		System.out.print(root.data  + " ");
		isBST3(root.right);
	}
	
	/**
	 * Capture the in order traversal elements into a list and find out
	 * whether they are in ascending order or not.
	 */
	private static void isAscending() {
		int i[] = new int[ ] {10, 15, 18, 20, 21, 22, 25};
	    boolean isAsecnding = true;
	    int temp = 10;
		for (int i1: i) {
			if (i1 >= temp) {
				temp = i1;
			} else {
				isAsecnding = false;
				break;
			}
		}
		System.out.print(isAsecnding);
	}
}
