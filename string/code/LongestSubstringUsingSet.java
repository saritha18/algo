package com.string.code;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringUsingSet {
  public static void main(String [] args) {
	  Set<Character> set= new HashSet<>();
	  String str="pswfacdw";
	  int n=str.length();
	  int ans=0,i=0,j=0;
	  while(i<n && j<n) {
		  if(!set.contains(str.charAt(j))) {
			 set.add(str.charAt(j++)); 
		  }else {
			  set.remove(str.charAt(i++));
		  }
		  
	  }
	  System.out.print(set.size());
  }
}
