package com.examples.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class LC692_TopKWords {

	public static void main(String[] args) {
		
		String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		System.out.println(topKFrequent(words, 4));
	}

	
	public static List<String> topKFrequent(String[] words, int k) {
        
        List<String> topKWords = new ArrayList<>();
        // check the base case
        if (words == null || words.length == 0) return topKWords;
        
        // create a map with words count
        HashMap<String, Integer> map = new HashMap<>();
        for (String str: words) {
            map.put(str, map.getOrDefault(str,0) + 1);
        }
        
        // create the priority queue (with comparator)
        PriorityQueue<String> pq = new PriorityQueue<>(
                                   (w1, w2) -> map.get(w1).equals(map.get(w2)) ?
                                               w1.compareTo(w2) : map.get(w1) - map.get(w2) );
        for (String word: map.keySet()) {
            pq.offer(word);
            if (pq.size() > k ) pq.poll();
        }
        
        // iterate the queue and add to 'topKWords'
        while(!pq.isEmpty()) {
            topKWords.add(pq.remove());
        }
        // Collections.sort(topKWords);
        return topKWords;
    }
}
