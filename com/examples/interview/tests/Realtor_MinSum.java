package com.examples.interview.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Realtor_MinSum {

	public static void main(String[] args) {
		int num2[] = {10,20,7};
        List<Integer> num = new ArrayList<>();
        for (int i : num2) {
            num.add(i);
        }
		int k = 4;
		System.out.println(minSum(num,k));
	}
	
	public static int minSum(List<Integer> num, int k) {
        // Write your code here
        if (num == null ) return -1;
        int sum = 0;
        if (k == 0) {
            for (int i : num) {
                sum += sum + i;
            }
            return sum;
        }
        PriorityQueue<Double> intQueue = new PriorityQueue<Double>(new Comparator<Double>(){
            @Override
            public int compare(Double o1, Double o2) {
                return -1 * o1.compareTo(o2);
            }
        });
        for (int t: num) {
        	 intQueue.add((double)t);
        }
        while (k > 0) {
            double  element = intQueue.remove();
            double temp = (double)Math.ceil(element/2);
            intQueue.offer(temp);
            k--;
        }
        // pull the elements from the priority queue and add them to the sum.
        for (int i=0; i < num.size(); i++) {
        	double  element = intQueue.remove();
        	sum += element;
        }
        return sum;
	}
}
