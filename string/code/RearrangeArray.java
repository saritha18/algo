package com.string.code;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class RearrangeArray {
	 public static void main(String args[] ) throws Exception {
		    Scanner in = new Scanner(System.in);
	         String s= in.nextLine();
	         char[] listOfChars= s.toCharArray();
	         List<Character> asList = new ArrayList<>();
	          List<Character> notMatching = new ArrayList<>();
	          for(Character c: listOfChars){
	             if(c=='a'){
	                asList.add(c);
	             }else{
	                notMatching.add(c);
	             }
	            
	         }
	         asList.addAll(notMatching);
	         asList.forEach(System.out::print);
  }
}
