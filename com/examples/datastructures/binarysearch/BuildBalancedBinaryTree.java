package com.examples.datastructures.binarysearch;

/**
 * Find the mid point
 * Iterate the same process on left (start to midpoint)
 * Iterate the same process on right (midpoint to end)
 * 
 */
public class BuildBalancedBinaryTree {
	  
	  public static void main(String[] args) {
		  	int[] intArray = new int[] {1,2,3,5,6,8,9,10, 11, 12, 14, 16};
		  	Node node = toBalancedBst(intArray);
		  	preOrderTrversal(node);
		}
	  
	  public static Node toBalancedBst(int arr[]) {
	      return toBalancedBst(arr, 0, arr.length - 1);
	  }

	private static Node toBalancedBst(int[] arr, int i, int j) {
		// ?? 
		 if (i > j) { 
	            return null; 
	      } 
		 int midpoint = (i + j) / 2; 
		 Node node  = new Node(arr[midpoint]); 
		 
		 System.out.println(midpoint  +  " " + i +  "  " + j);
		 
		 node.left = toBalancedBst(arr, i, midpoint-1); 
		 node.right = toBalancedBst(arr, midpoint+1,j);    
		 
		return node;
	}
	
	/**
	 * Pre order traversal - root, left, right
	 * @param node
	 */
	public static void preOrderTrversal(Node node) {
		
		if (node == null) { 
            return; 
        } 
        System.out.print(node.data + " "); 
        preOrderTrversal(node.left); 
        preOrderTrversal(node.right); 
		
	}
  }
	 
