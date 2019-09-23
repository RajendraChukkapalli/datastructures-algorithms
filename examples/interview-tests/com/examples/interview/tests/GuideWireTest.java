package com.examples.interview.tests;
import java.util.*;

/**
 * Given the seat chat for a airplane: find out the number of consecutive seats available for
 * 3-member family
 * 
 * Seating arrangements are below;
 * 
 * if excluded seats are 1A  1K       then  - 10 sets are availble 
 * if excluded seats are 1G 1A 2A 3A  then  - 8  sets are availble 
 * 
 *  1   -   A B C    D E F G    H J K
 *  2   -   A B C    D E F G    H J K
 *  3   -   A B C    D E F G    H J K
 *  4   -   A B C    D E F G    H J K
 *  
 * Test duration:  2 questions (1:30 min)
 * I took 1:30 Min for this program with a 2 mistakes listed below
 * 
 */
class GuideWireTest {
	
	public static void main(String...strings) {
		GuideWireTest test = new GuideWireTest();
		int ans  = test.solution(2, new String("1A 2F 1C"));
		System.out.println(ans);
	}

	
    public int solution(int N, String S) {
        // write your code in Java SE 8
        StringTokenizer st = new StringTokenizer(S, " ");
        List<String> excludedSeats = new ArrayList<String>();
        while(st.hasMoreTokens()) {
            excludedSeats.add(st.nextToken());
        }
        Character[] c1 = {'A','B','C'};
        Character[] c2 = {'D','E','F', 'G'};
        Character[] c3 = {'H','J','K'};
        
        Map<Integer, Character[]> hashCharMap = new HashMap<Integer, Character[]>();
        hashCharMap.put(1,c1);
        hashCharMap.put(2,c2);
        hashCharMap.put(3,c3);
        
        // generate all the sets.
        Set<String> stringSet = new HashSet<>();
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=3; j++ ) {
                Character[] charArray =  hashCharMap.get(j);
                String str = "";
                for (char C :  charArray) {
                   str += i+""+C;
                }
                stringSet.add(str);
                System.out.print(str + " ");  
            }
        }
        return isExcludedSeat(excludedSeats, stringSet);
    }
 
    /**
     * Check each set and see whether the seats are excluded or not
     */
    private int isExcludedSeat(List<String> excludedSeats, 
                                   Set<String>  stringSet) {
        
        int count = 0;
        Set<String>  excludedSet = new HashSet<String>();
        for (String str :  excludedSeats) {
            if(isAlreadyExcluded(str,excludedSet)) continue;
            for (String temp :  stringSet ) {
            	// Mistake1: I was comparing str.contains(temp)
                if (temp.contains(str)) {
                    excludedSet.add(temp);
                    count +=1;
                }
            }
        }
        return stringSet.size() - count;
    }
    
    /** 
     * Check whether the set is already excluded
     */ 
    private boolean isAlreadyExcluded(String str, Set<String> excludedSet) {
        for ( String temp : excludedSet) {
        	// Mistake1: I was comparing str.contains(temp) (same mistake as above)
            if (temp.contains(str)) return true;
        }
        return false;
    }
}