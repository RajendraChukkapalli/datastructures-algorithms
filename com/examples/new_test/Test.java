package com.examples.new_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		int[] nums = new int[] {10,9,8,4,3,2,1,-1,-22,-100,-1000};
		
		int i = 2;
		if ( (i & 1) == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
		
		 
		 
		/*
		 * // singleNumber(nums); heapTest(nums); // reverseaNumber(nums, 3);
		 * 
		 * for (int i: nums) { System.out.println(i + " "); }
		 */
		
		// System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
		
		/*
		 * String s = "aabbccddeefghi"; isValidString(s);
		 */
		
		/*
		 * List<Integer> nums2 = new ArrayList<>(); nums2.add(20); nums2.add(10);
		 * nums2.add(7);
		 * 
		 * System.out.println(minSum(nums2, 2));
		 */
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
		PriorityQueue<Integer> intQueue = new PriorityQueue<Integer>((i1, i2) -> -1 * (i1.compareTo(i2))	/*
																		 * new Comparator<Integer>(){
																		 * 
																		 * @Override public int compare(Integer o1,
																		 * Integer o2) { return -1 * o1.compareTo(o2); }
																		 * }
																		 */);
	        

	        
	        intQueue.addAll(num);
	        
	        while (k > 0) {
	            int  element = intQueue.remove();
	            int temp =  (int)Math.ceil(element/2);
	            sum += temp;
	            intQueue.offer(temp);
	            k--;
	        }
	        return sum;
	}
	
	static String isValidString(String s) {
	    final String GOOD = "YES";
	    final String BAD = "NO";

	    if(s.isEmpty()) return BAD;
	    if(s.length() <= 3) return GOOD;

	    int[] letters = new int[26];
	    for(int i = 0; i < s.length(); i++){
	        letters[s.charAt(i) - 'a']++;
	    }
	    Arrays.sort(letters);
	    int i=0;
	    while(letters[i]==0){
	        i++;
	    }
	    //System.out.println(Arrays.toString(letters));
	    int min = letters[i];   //the smallest frequency of some letter
	    int max = letters[25]; // the largest frequency of some letter
	    String ret = BAD;
	    if(min == max) ret = GOOD;
	    else{
	        // remove one letter at higher frequency or the lower frequency 
	        if(((max - min == 1) && (max > letters[24])) ||
	            (min == 1) && (letters[i+1] == max))
	            ret = GOOD;
	    }
	    return ret;
	}

	static int makeAnagram(String a, String b) {

    	if (a == null || b == null) return 0;

        int[] intArray = new int[127];
        char ca[] = a.toCharArray();
        char cb[] = b.toCharArray();

        for(int i=0; i < a.length(); i++) {
            intArray[a.charAt(i) - 'a' + 1]++;
        }

        for(int i=0; i < b.length(); i++) {
            intArray[b.charAt(i) - 'a' + 1]--;
        }
    
        // int count = Arrays.stream(intArray).filter();
        int count = 0;
        for (int i : intArray) {
            if (i != 0) count += Math.abs(i);
        }
        
      return count;
    }

    public static void singleNumber(int[] nums) {
        // create a map with all the counts
        Map<Integer, Integer> numberCount = new HashMap<>();
        for (int num: nums) {
            numberCount.put(num, numberCount.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
        	System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        	if (entry.getValue() == 1) {
        		System.out.println(entry.getKey());
        	}
        } 
    }
    
    private static void heapTest(final int[] nums) {
    	
    	PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// return o2.intValue() - o1.intValue();
				return -1 * o1.compareTo(o2);
			}});
    	for (int i : nums) {
    		pq.add(i);
    	}
    	while (!pq.isEmpty()) {
    		System.out.println(pq.remove());
    	}
    }
    
    
    public static void reverseaNumber(int[] nums, int k) {
    		k %= nums.length;
    	    reverse(nums, 0, nums.length - 1);
    	    reverse(nums, 0, k - 1);
    	    reverse(nums, k, nums.length - 1);
    	    
    }
    
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
          int temp = nums[start];
          nums[start] = nums[end];
          nums[end] = temp;
          start++;
          end--;
        }
      }
}
