package com.examples.generalprograms;

public class Test {

	public static void main(String[] args) {
		
//		String inputStr  = "anvbcterdHHHdemadhfdahduiodl"; 
//		// print all the characters 
//		for (int i=0; i< inputStr.length(); i++) {
//			String str = inputStr.substring(i, i+1);
//			System.out.println(str);
//		}
//		char c = 'A';
//		System.out.println ((int)c);
		String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
		Long n = 736778906400L;
		temp(s, n);
	}

	
	// amazing answer - copied from Hacker Rank.
	public static void temp(String s, Long n) {
	    //String s = in.next();
	    //long n = in.nextLong();
	    long count =0;
	    for(char c : s.toCharArray())
	        if(c == 'a')
	        count++;

	     long factor = (n/s.length());
	     long rem = (n%s.length());
	     count =  factor*count  ;
	    for(int i=0;i<rem;i++)
	        if(s.charAt(i)=='a')
	                count++;        
	    System.out.println(count);
	}
	
	
}
