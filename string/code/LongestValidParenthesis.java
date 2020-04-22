package com.string.code;

import java.util.Scanner;
import java.util.Stack;

public class LongestValidParenthesis {
		  public static void main(String []args) {
			  Scanner sc= new Scanner(System.in);
			  String s= sc.nextLine();
			  LongestValidParenthesis l= new LongestValidParenthesis();
			  l.longestValidParentheses(s);
		  }
		  
		  public int longestValidParentheses(String s) {
			    // IMPORTANT: Please reset any member data you declared, as
			    // the same Solution instance will be reused for each test case.
			    
			    int maxLen = 0;
			    
			    //the position of the last ')'
			    //so when left stack is empty(all matched), use this to calculate the length
			    int last = -1;
			    
			    Stack<Integer> left = new Stack<Integer>();
			    
			    for (int i = 0; i < s.length(); i++) {
			    	System.out.println("i"  +i);
			        if (s.charAt(i) == '(') {
			            left.push(i);
			        } else {
			            if (left.isEmpty()) {
			                last = i;
			            } else {
			                left.pop();
			                if (left.isEmpty()) {
			                    //all matched by now
			                	System.out.println("last:"  +last);
			                	 System.out.println(i-last);
			                     maxLen = Math.max(maxLen, i - last);
			                    System.out.println("MaxLEN"+maxLen);
			                } else {
			                	System.out.println("PEEK"+left.peek());
			                    maxLen = Math.max(maxLen, i - left.peek());
			                    System.out.println("maxlen"+maxLen);
			                }
			            }
			            
			        }
			    }
			    
			    return maxLen;
			    
		  }
}	 
	

