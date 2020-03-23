package com.examples.generalprograms;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {

        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int J[] = solution(A, K);
        Arrays.stream(J).forEach(n -> System.out.print(n + " "));
    }

    public static int[] solution(int[] A, int K) {

        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int newIndex = (i+K) % A.length;
            result[newIndex] = A[i];
        }
        return result;
    }
}