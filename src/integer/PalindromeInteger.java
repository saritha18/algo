package com.src.integer;

public class PalindromeInteger {

	 public static void main(String[] args) {
		 int x=2147483647;
		 PalindromeInteger palindrome= new PalindromeInteger();
		 System.out.println(palindrome.isPalindrome(x));
		 
	 }

	private boolean isPalindrome(int x) {
		   if (x<0 || (x!=0 && x%10==0)) return false;
		    int rev = 0;
		    while (x>rev){
		    	rev = rev*10 + x%10;
		    	x = x/10;
		    }
		    return (x==rev || x==rev/10);
		
	}
		
}
