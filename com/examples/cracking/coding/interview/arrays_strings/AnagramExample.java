package com.examples.cracking.coding.interview.arrays_strings;

/**
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once
 *
 */
public class AnagramExample {

    public static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean permutation(String s, String t) {
        return sort(s).equals(sort(t));
    }

    public static boolean permutation2(String s, String t) {
        if (s.length() != t.length()) return false; // Permutations must be same length

        int[] letters = new int[128]; // Assumption: ASCII
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i)]--;
            if (letters[t.charAt(i)] < 0) {
                return false;
            }
        }
        return true; // letters array has no negative values, and therefore no positive values either
    }



    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];

            boolean anagram = permutation(word1, word2);
            boolean anagram2 = permutation2(word1, word2);

            System.out.println(word1 + ", " + word2 + ": " + anagram);
            System.out.println(word1 + ", " + word2 + ": " + anagram2);


        }
    }
}

