package com.examples.test;

public final class Excel {

    private Excel() {}  

    public static int getExcelColumnNumber(String column) {
        int result = 0;
        for (int i = 0; i < column.length(); i++) {
            result *= 26;
            result += column.charAt(i) - 'A' + 1;
        }
        return result;
    }

    public static String getExcelColumnName(int number) {
        final StringBuilder sb = new StringBuilder();

        int num = number;
        while (num >=  0) {
            int numChar = (num % 26)  + 65;
            sb.append((char)numChar);
            num = (num  / 26);
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
    	
    	System.out.println(getExcelColumnNumber("BA"));
    	//System.out.println(getExcelColumnName(53));
    	
//         Assert.assertEquals(53, getExcelColumnNumber("BA"));
//         Assert.assertEquals("BA", getExcelColumnName(53));
//
//         Assert.assertEquals(703, getExcelColumnNumber("AAA"));
//         Assert.assertEquals("AAA", getExcelColumnName(703));
//
//         Assert.assertEquals(26, getExcelColumnNumber("Z"));
//         Assert.assertEquals("Z", getExcelColumnName(26));
//
//         Assert.assertEquals(702, getExcelColumnNumber("ZZ"));
//         Assert.assertEquals("ZZ", getExcelColumnName(702));

    }
}