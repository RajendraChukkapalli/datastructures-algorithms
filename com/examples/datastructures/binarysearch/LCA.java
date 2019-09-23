package com.examples.datastructures.binarysearch;

public class LCA {

	public static void main(String args[]) {
		
		int[] intSortedArray  = new int[]{-1, 0, 10,20,30,40,50,60,70,80,90,100};
		BinaryTreeNode node =  BSTInOrderTraversal.buildBST(intSortedArray, 0, intSortedArray.length-1);
		BinaryTreeNode temp = lowestCommonAncestor(node, new BinaryTreeNode(-1), new BinaryTreeNode(0));
		System.out.println(temp.value);
		
		BinaryTreeNode temp2 = lowestCommonAncestor2(node, new BinaryTreeNode(-1), new BinaryTreeNode(0));
		System.out.println(temp2.value);
		
	}

	/**
	 * Iterative approach 
	 * 
	 * @param root
	 * @param p
	 * @param q
	 * @return
	 */
    private static BinaryTreeNode lowestCommonAncestor2(BinaryTreeNode root, BinaryTreeNode p,
			BinaryTreeNode q) {
    	
    	// Value of p
        int pVal = p.value;

        // Value of q;
        int qVal = q.value;

        // Start from the root node of the tree
        BinaryTreeNode node = root;

        // Traverse the tree
        while (node != null) {

            // Value of ancestor/parent node.
            int parentVal = node.value;

            if (pVal > parentVal && qVal > parentVal) {
                // If both p and q are greater than parent
                node = node.right;
            } else if (pVal < parentVal && qVal < parentVal) {
                // If both p and q are lesser than parent
                node = node.left;
            } else {
                // We have found the split point, i.e. the LCA node.
                return node;
            }
        }
        return null;
    
	}

    /**
     * recursive approach
     * 
     * @param root
     * @param p
     * @param q
     * @return
     */
	public static BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {

        // Value of current node or parent node.
        int parentVal = root.value;

        // Value of p
        int pVal = p.value;

        // Value of q;
        int qVal = q.value;

        if (pVal > parentVal && qVal > parentVal) {
            // If both p and q are greater than parent
            return lowestCommonAncestor(root.right, p, q);
        } else if (pVal < parentVal && qVal < parentVal) {
            // If both p and q are lesser than parent
            return lowestCommonAncestor(root.left, p, q);
        } else {
            // We have found the split point, i.e. the LCA node.
            return root;
        }
    }
}
