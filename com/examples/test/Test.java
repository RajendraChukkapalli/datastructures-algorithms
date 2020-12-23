package com.examples.test;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

class Test {
	
	

	public static void main(String[] args) {
		
		int i = 0;
		System.out.println(3 % 4); 
		if(i % 2 != 0) {
			System.out.println("1"); 
		} else {
			System.out.println("2"); 
		}
		
		
		Integer i1 = new Integer(1);
		System.out.println("1".equals(i1));
		
		int arr[] = {2, 11, 5, 1, 4, 7};
		
		
		
		// 0 < 4  k = 0 
		// 1 < 3  k = 1
		// 2 < 2  
//		String paragraph = "Bob";
//		String banned[] = {}; 
//		
//		Temp t = new Temp(10, "A");
//		System.out.println(t);
//		Temp t1 =  new Temp(10, "A");
//		System.out.println(t1); 
//		System.out.println(t.equals(t1));
//		System.out.println(t.getName() + "  ===  " + t1.getName());

		// System.out.println(mostCommonWord(paragraph, banned));
		
//	    Integer b = 14;
//	    System.out.println(Integer.toBinaryString(b));
//	    b = b >> 1;
//	    System.out.println(Integer.toBinaryString(b));
	    
	    
//	    String digits = "23";
//	    int index = 0;
	    
	    // System.out.println(isUgly(9));
		
//		int i = 4;
//		int j = 0;
//		int k = 0;
//		int l = 1;
//		int m = 1;
//		int n = 2;
//		int p = 3;
//		int q = 3;
//		int r = 4;
//		
//		int i1 = i ^ j;
//		System.out.println(i1);
//		int i2 = i1 ^ k;
//		System.out.println(i2);
//		int i3 = i2 ^ l;
//		System.out.println(i3);
//		int i4 = i3 ^ m;
//		System.out.println(i4);
//		
//		
//		System.out.println( 4 ^ 0 ^0 ^ 1 ^ 1 ^ 2 ^3 ^3 ^4);
		
//		int[] array = {1,2,4,3};
//		selectionSort(array);
//		Arrays.stream(array).forEach(n -> System.out.print(n + " "));
		
		String s = "Hey";
		StringBuilder builder = new StringBuilder(s);
		System.out.println(s.equals(builder));
		System.out.println(s.contentEquals(builder));
		
		
		String s1 = String.join("-", "a", "b");
		System.out.println(s1);
		
		List list = new ArrayList<>(List.of("A", "B"));
		Iterator iter = list.listIterator();
		list.set(1, "C");
		if(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		int[] intArray = new int[10];
//		for (int i=0; i<intArray.length; i++) {
//			intArray[i] = i*i;
//		}
//		Arrays.stream(intArray).forEach(n -> System.out.print(n + " "));
//		
//		Arrays.stream(intArray).flatMap(new IntFunction<>() {
//			@Override
//			public IntStream apply(int value) {
//				return null;
//			}
//			
//		});
	    
//	    String combinations[] = {
//				"0", "0", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//	    
//	    System.out.println(digits.charAt(index));
//	    int i = digits.charAt(index);
//	    System.out.println(i);
//	    String letters = combinations[i];
//	    
//	    System.out.println(letters);
	    
//	    int i[] = {2,3,4,0};
//	    for (int j = i.length - 1; j > 0; j--) {
//            i[j] = i[j-1];
//        }
//	    System.out.println(i);
	    
	

//		String s[] = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
//		for (String t: s) {
//			 System.out.println(t);
//		}
	}
//
//
//	private static void selectionSort(int[] array) {
//	    // Write your code here.
//		for (int i = array.length - 1; i > 0; i--) {
//			int largestIndex = i;
//			for (int j = i; j < array.length-1; j++) {
//					if (array[j] > array[j+1]) {
//						largestIndex = j;
//					}
//				swap(array, largestIndex, i);
//			}
//		}
//		}
//
//
//	private static void swap(int[] array, int from, int to) {
//		if (from == to) return;
//		int temp = array[from];
//		array[from] = array[to]; 	
//		array[to] = array[from];
//		
//	}
//
//
//	public static String mostCommonWord(String paragraph, String[] banned) {
//
//		paragraph += ".";
//
//		Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
//		// StringTokenizer st = new StringTokenizer(paragraph, "?',;. !");
//
//		int max = -1;
//		String result = "";
//
//		Map<String, Integer> map = new HashMap<>();
//		StringBuilder word = new StringBuilder();
//		for (char c : paragraph.toCharArray()) {
//			if (Character.isLetter(c)) {
//				word.append(Character.toLowerCase(c));
//			} else if (word.length() > 0) {
//				String s = word.toString();
//				if (!bannedWords.contains(s)) {
//					map.put(s, map.getOrDefault(s, 0) + 1);
//					if (map.get(s) > max) {
//						result = s;
//						max = map.get(s);
//					}
//				}
//				word = new StringBuilder();
//			}
//		}
//		return result;
//	}
//	
//    public static boolean isUgly(int num) {
//        if(num == 0) return false;
//        if(num == 1) return true;
//        
//        while(num%2 == 0) {
//        	num = num/2;        
//        }
//        while(num%3 == 0) num = num/3;        
//        while(num%5 == 0) num = num/5;
//        
//        return num == 1;
//    }
//}


class Temp {
	private int no;
	private String name;
	public Temp(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temp other = (Temp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		return true;
	}
}
	


	private static void selectionSort(int[] array) {

	    
	  }
			
	private static void swap(int[] array, int from, int to) {
			if (from == to) return;
			int temp = array[from];
			array[from] = array[to]; 	
			array[to] = array[from];
	}
}



//interface Foo {
//	
//	String name = "Foo";
//	void print();
//	
//}

//public class Test implements Foo {
//	String name = "Bar";
//	public void print() {
//		System.out.println(name);
//	}
//	public static void main(String args[]) {
//		
//		String[] s = {"1", "2", "3"};
//		String s1 = Arrays.toString(s);
//		System.out.println(s1);
//		try {
//			foo();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//	static void foo() throws Exception {
//		throw new Exception("Foo");
//		
//	}
//}