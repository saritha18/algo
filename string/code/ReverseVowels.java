package com.string.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
	public static void main(String[] args) {
		String s="hello";
		ReverseVowels reverse = new ReverseVowels();
		if(s!= null || s.length()!=0) {
			System.out.println(reverse.reverseString(s));
		}
		
	}

	private String reverseString(String s) {
		Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		char[] charArray= s.toCharArray();
		int left=0,right=charArray.length-1;
		while(left < right) {
			if(!vowels.contains(charArray[left])) {
				left++;
			}else if(!vowels.contains(charArray[right])) {
				right--;
			}else {
				char temp= charArray[left];
				charArray[left]=charArray[right];
				charArray[right]= temp;
				left++;
				right--;
				
			}
		}
		return new String(charArray);
	}

}
