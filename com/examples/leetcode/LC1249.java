package com.examples.leetcode;

public class LC1249 {

	public static void main(String[] args) {
		String s = "(((lee(t(c)o)de)";
		System.out.print(minimumRemoveToMakeItValidParentheses(s));
	}

	/**
	 * 1  add 1 for '('
	 * 2. subtract ')' if count > 0 
	 * 3. build string builder
	 * 4. iterate the string builder from the last
	 * 5. if '(' and count > 0, remove the char. don't add it to the new string builder.
	 * 6. if not, just add to the new string builder 
	 * 7. reverse and return the string.
	 * 
	 * @param s
	 * @return
	 */
	public static String minimumRemoveToMakeItValidParentheses(String s) {
		int count = 0;
		StringBuilder sb = new StringBuilder(), sb2 = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (ch == '(')
				count++;
			if (ch == ')') {
				if (count == 0)
					continue;
				else
					count--;
			}
			sb.append(ch);
		}
		for (int i = sb.length() - 1; i >= 0; i--) {
			if (sb.charAt(i) == '(' && count > 0) {
				count--;
			} else
				sb2.append(sb.charAt(i));
		}
		return sb2.reverse().toString();
	}
}
