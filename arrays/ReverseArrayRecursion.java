package com.arrays;

public class ReverseArrayRecursion {
  public static void main(String []args) {
	  char [] s= {'h','e','l','l','o'};
	  helper(0,s.length-1,s);
	  System.out.println(s);
  }



private static void helper(int start, int end, char[] s){
    if (start >= end || s == null){
        return;
    }    
    
    char temp = s[start];
    s[start] = s[end];
    s[end] = temp;
    helper(++start, --end, s);
}
}