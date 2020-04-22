package com.string.code;

import java.util.Scanner;

class CheckPalindrome {
    public static void main(String args[] ) throws Exception {
    	      Scanner s = new Scanner(System.in);
    	        int length= s.nextInt();
    	        s.nextLine();
    	        for(int i=0;i<length;i++){
    	               System.out.println(checkPalindrome(s.nextLine()));
    	              
    	        } 
    	        
    	    }  


    		private static String checkPalindrome(String m) {
    			  int n = m.length();
    			     for (int i = 0; i < (n/2); ++i) {
    			             if (m.charAt(i) != m.charAt(n - i - 1)) {
    			                    return "NO";
    			            }
    			         }
    			        if(n%2 == 0){
    			            return "YES"+" " +"EVEN";
    			        }else{
    			            return "YES"+" " +"ODD";
    			        }
    			        
    			        
    		}

	
}