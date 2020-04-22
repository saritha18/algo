package com.april;

public class LongestSubstringWithkDistinctCharecters {
	
	public static void main(String[] args) {
		String s="abcc"; int k=2;
		int[] map = new int[128];
		int start = 0, end= 0, maxLen=0, counter = 0;
		while(end < s.length()) {
		    final char c1= s.charAt(end);
		    if(map[c1] == 0) {
		    	counter++;
		    }
		    System.out.println(c1);
		    map[c1]++;
		    end++;
			while(counter > k) {
				final char c2 = s.charAt(start);
				if(map[c2] == 1) {
					counter --;
				}
				map[c2]--;
				start++;
				System.out.println(c2);
			}
		   maxLen = Math.max(maxLen, end-start);
		}
	  System.out.println(maxLen);
	}
	
}







