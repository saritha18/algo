package com.string.code;

public class MostOccurredCharecter {
 
	private static final int ASCII_SIZE = 120;

	public static void main(String []args) {
		MostOccurredCharecter m= new MostOccurredCharecter();
		char result=m.findMostOccurredChar("avcc");
	}

	private char findMostOccurredChar(String str) {
		 int count[] = new int[ASCII_SIZE]; 
		 int len=str.length();
		 for(int i=0;i<len;i++) {
			 count[str.charAt(i)]++;
		 }
		 
		 int max = -1;  // Initialize max count 
	     char result = ' ';   // Initialize result 
	       
	        // Traversing through the string and maintaining 
	        // the count of each character 
	        for (int i = 0; i < len; i++) { 
	            if (max < count[str.charAt(i)]) { 
	                max = count[str.charAt(i)]; 
	                result = str.charAt(i); 
	            } 
	        } 
	       
		return result;
		
		
	}
	
}
