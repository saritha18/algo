package com.string.code;

public class BackSpaceStringWithoutStock {
	
		public static void main(String [] args) {
			  BackSpaceStringWithoutStock backSpace= new BackSpaceStringWithoutStock();
			  String s="b#ca", y="cb#a";
			  System.out.println(backSpace.backspaceCompare(s,y));
		}
		
	     private boolean backspaceCompare(String S, String T) {
	      return buildString(S).equals(buildString(T));
	    }
	    
	    private String buildString(String str) {
	        
	        StringBuilder sb = new StringBuilder();
	        for (char ch : str.toCharArray()) {
	            if (ch != '#') {
	                sb.append(ch);
	            } else if (sb.length() != 0) {
	                sb.deleteCharAt(sb.length() - 1);
	            }
	        }
	        
	        return sb.toString();
	    } 
}
