package com.examples.crack_code_interview.arrays_strings;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		String s = "2[a]3[b]4[c]";
		System.out.println(decodeString2(s));
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

	
	public static String decodeString2(String s) {
        
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();
        
        String res = "";
        int index = 0;
        
        while (index < s.length()) {
            
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + s.charAt(index) - '0';
                    index += 1;
                }
                counts.push(count);
            } else if (s.charAt(index) == '[') {
                result.push(res);
                res="";
                index += 1;
            } else if (s.charAt(index) == ']') {
                StringBuilder builder = new StringBuilder(result.pop());
                int count = counts.pop();
                for (int i=0;  i < count; i++) {
                    builder.append(res);
                }
                res = builder.toString();
                index += 1;
            } else {
                res += s.charAt(index);
                index += 1;
            }
        }
        return res.toString();
    }
}
