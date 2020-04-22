package com.string.code;

public class ReverseString {
	
	public static void main(String []args) {
		String str = "world";
		ReverseString reverse= new ReverseString();
		 //String reverseStr = new StringBuffer(str).reverse().toString();
		 String reverseString = reverse(str);
	     System.out.println("Reverse String in Java using Iteration: " + reverseString);
		String reversedString=reverse.reverseRecursively(str);
		System.out.println("Reverse String in Java using Recursion: " + reversedString);
		 
	}

	public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }
	
	
	private String reverseRecursively(String str) {
		if(str.length()<2) {
			return str;
		}
		return reverseRecursively(str.substring(1))+str.charAt(0);
		
	}
	
    
     
}
