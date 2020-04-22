package com.string.code;

import java.util.Arrays;
import java.util.List;

public class WordSquare {
        public static void main(String []args) {
        	String[] s= {"abcd","bnrta","crm","dt"};
        	List<String> words = Arrays.asList(s);
        	WordSquare word = new WordSquare();
        	System.out.println(word.validSquare(words));
        }

		private boolean validSquare(List<String> words) {
		    for(int i = 0;i < words.size(); i++) {
		    	 String cur = words.get(i);
		    	for(int j = 0; j < cur.length();j++) {
		    		if(words.size()<=j)  return false;
		    		String tmp = words.get(j);
		    		if(tmp.length() < i + 1 || tmp.charAt(i) != cur.charAt(j)) return false;
		    	}
		    }
			return true;
			
		}
}
