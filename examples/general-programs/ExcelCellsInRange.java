package com.examples.generalprograms;

public class ExcelCellsInRange {

	public static void main(String[] args) {
		String inputStr = "A12:C11";
		String[]  tokens = inputStr.split(":"); 
		char charArray[] = new char[2];
		int intLen[] = new int[2];
		int i = 0;
		for (String token : tokens)  {
			System.out.println(token.trim());
			char charArray2[] =  token.substring(0,1).toCharArray();
			charArray[i] = charArray2[0];
			String startCell =  token.substring(1, (token.length()));
			Integer i1 = Integer.valueOf(startCell);
			intLen [i] = i1;
			i += 1;
		}
		
		StringBuffer buffer =   new StringBuffer();
		for (int i1 = 0, jChar = (int) charArray[i1] ; jChar <=  (int) charArray[charArray.length-1]  ; i1++,  jChar ++ ) {
			char c   = (char)jChar;
			for (int k=intLen[0] ;  ( k <= intLen[1]) ; k ++) {
				buffer.append("\"" + c +""+ k + "\"" + ",");
				System.out.println(buffer.toString());
			}
		}
		System.out.println("(" + buffer.toString().substring(0, buffer.toString().length() -1) + ")");
	}
}
