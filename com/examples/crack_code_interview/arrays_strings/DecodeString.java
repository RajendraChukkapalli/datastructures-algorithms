package com.examples.crack_code_interview.arrays_strings;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {

		
		String s = "ab24[a34[c]]24[abc]";
		
		System.out.println(decodeString(s));
	}
	
	public static String decodeString(String s) {
        // base case, do nothing sequence to repeat
        if (s.indexOf('[') == -1 && s.indexOf(']') == -1) {
            return s;            
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            sb.append(c);
            
            if (c == '[') {
                stack.push(c);
            } else if (c == ']') {
                stack.pop();    
            }
            
            if (Character.isDigit(c)) {
                continue;
            }

            if (stack.isEmpty()) {
                String soFar = sb.toString();
                
                int leftBracket = soFar.indexOf('[');
                int rightBracket = soFar.lastIndexOf(']');
                
                sb.setLength(0);
                
                if ((leftBracket != -1) && (rightBracket != -1)) {
                    System.out.println(soFar);
                    int occurrence = Integer.parseInt(soFar.substring(0, leftBracket));
                    String inner = soFar.substring(leftBracket + 1, rightBracket);
                    String innerResult = decodeString(inner);
                    while (occurrence > 0) {
                        answer.append(innerResult);
                        occurrence--;
                    }
                } else {
                    answer.append(soFar);
                }
                
            }
        }
        
        return answer.toString();
    }

}
