package com.string.code;

import java.util.HashMap;
import java.util.Map;

public class Pattern {
   public static void main(String[] args) {
	 String pattern="abba";
	 String str="cat dog cat dog";
	 Pattern patternObj= new Pattern();
	 patternObj.wordPattern(pattern,str);
   }
   public boolean wordPattern(String pattern, String str) {
	    String[] words = str.split(" ");
	    if (words.length != pattern.length())
	        return false;
	    Map index = new HashMap();
	    for (Integer i=0; i<words.length; ++i)
	    	//System.out.println(index.put(pattern.charAt(i), i) != index.put(words[i], i));
	       if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
	           return false;
	    return true;
	}
}
