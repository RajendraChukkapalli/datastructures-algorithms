package com.examples.new_test;

import java.util.*;

class Solution {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public void helper(TreeNode node, int level) {
        // start the current level
        if (levels.size() == level)
            levels.add(new ArrayList<Integer>());

         // append the current node value
         levels.get(level).add(node.val);

         // process child nodes for the next level
         if (node.left != null)
            helper(node.left, level + 1);
         if (node.right != null)
            helper(node.right, level + 1);
    }
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        Collections.reverse(levels);
        return levels;
    }
    
    public static void main(String...strings) {
    	
    	TreeNode root = new TreeNode(40);
    	
    	// level1
    	TreeNode leftRoot = new TreeNode(20);
    	TreeNode rightRoot = new TreeNode(30);
    	
    	root.left = leftRoot;
    	root.right = rightRoot;
    	
    	// level2 
    	TreeNode leftleftChild = new TreeNode(15);
    	TreeNode leftrightChild = new TreeNode(25);
    	leftRoot.left = leftleftChild;
    	leftRoot.right = leftrightChild;
    	
    	TreeNode rightleftchild = new TreeNode(26);
    	TreeNode rightrightChild = new TreeNode(35);
    	
    	rightRoot.left = rightleftchild;
    	rightRoot.right = rightrightChild;
    	
    	Solution s = new Solution();
    	System.out.println(s.levelOrderBottom(root)); 
    }
}

class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }