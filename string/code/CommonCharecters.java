package com.string.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonCharecters {
    public static void main(String[] args) {
    	String A[]= {"bel","gel","eesl"};
    	CommonCharecters common= new CommonCharecters();
    	 List<String> answer=common.commonChars(A);
    	 for(String a:answer) {
    		 System.out.print(a);
    	 }
    }

	private List<String> commonChars(String[] a) {
		List<String> ans= new ArrayList<>();
		int[] count= new int[26];
		 Arrays.fill(count, Integer.MAX_VALUE);
		 for (String str :a) {
	            int[] cnt = new int[26];
	            for (char c : str.toCharArray()) {
	            	++cnt[c - 'a']; } // count each char's frequency in string str.
	            System.out.println(" ");
	            for(int i=0;i<cnt.length;i++) {
	            	System.out.print(cnt[i]);
	            }
	            for (int i = 0; i < 26; ++i) { 
	            	count[i] = Math.min(cnt[i], count[i]); } // update minimum frequency.
	            
	            System.out.println("      ");
	 		   for(int i=0;i<count.length;i++) {
	 			   System.out.print(count[i]);
	 		   }
	        }
		 
	        for (int i = 0; i < 26; ++i) {
	            while (count[i]-- > 0) { ans.add("" + (char)(i + 'a')); }
	        }
	        return ans;
	}


}
