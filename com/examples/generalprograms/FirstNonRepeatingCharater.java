package com.examples.generalprograms;

public class FirstNonRepeatingCharater {
	public static void main(String[] args) {
		System.out.println(firstNotRepeatingCharacter("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"));
	}
	static char firstNotRepeatingCharacter(String s) {
	    if (s == null || s.length() == 0) return '_';
	    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    int  count[] = new int[26];
	    for (char c1 : s.toCharArray()) {
	    	int t = c1 - '0';
	    	int cIndex = alphabet[t-49]-'0';
	    	count[cIndex-49]++;
	    }
	    for (int j = 0; j < count.length; j++) {
	    	if(count[j] == 1) {
	    		System.out.println(j);
	    		return alphabet[j];
	    	}
	    }
	    return '_';
	}
}
