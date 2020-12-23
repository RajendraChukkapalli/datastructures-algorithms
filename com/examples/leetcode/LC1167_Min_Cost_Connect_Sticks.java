package com.examples.leetcode;

import java.util.PriorityQueue;

/**
 * https://www.youtube.com/watch?v=3dqR2nYElyw
 * AMAZON - MINIMUM COST TO CONNECT STICKS
 */
public class LC1167_Min_Cost_Connect_Sticks {

	public static void main(String[] args) {
		
		int[] intArray = {1,8,3,5};
		
		System.out.println(calculateMinCostToConnnectSticks(intArray));

	}

	private static int calculateMinCostToConnnectSticks(int[] intArray) {
		int cost = 0;
		
		// min heap.
		// add all elements to the priority queue
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int stick: intArray) {
			minHeap.add(stick);
		}
		// read the sticks from heap
		// calculate the cost
		// add the sum back to priority queue
		while (minHeap.size() > 1) {
			int sum = minHeap.remove() + minHeap.remove();
			cost += sum;
			System.out.println("cost ---->  " + cost);
			minHeap.add(sum);
		}
		return cost;
	}
}
