package com.examples.codility;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(solution(1041));
	}
	
	public static int solution(int N) {
        // write your code in Java SE 8
        String str =  getBinaryString(N);
 
        convertBinary(N);
        System.out.println(str);
        int max = 0;
        int start = 0;
        int end = 0;
        boolean startFound = false;
        boolean endFound = false;
        for (int i = 0; i < str.length(); i++) {
            if(!startFound && str.charAt(i) == '1') {
                startFound = true;
                start = i;
            } else if (str.charAt(i) == '1') {
                end = i;
                endFound = true;
            }
            if (startFound && endFound) {
                max = Math.max(max, Math.abs(end - start));
                start = i;
                endFound = false;
            }
        }
        return max;
    }
    
    private static String getBinaryString(int N) {
        
        StringBuilder builder = new StringBuilder();
        while (N > 0) {
         int rem = N % 2;
         N = N / 2;
         builder.append(rem);
        }
        return builder.reverse().toString();
    }
    
    
    public static void convertBinary(int num){
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
          binary[index++] = num%2;
          num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
          System.out.print(binary[i]);
        }
        System.out.println();
     }

}
