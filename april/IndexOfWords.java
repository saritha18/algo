package com.april;

import java.util.HashSet;

public class IndexOfWords {

	public static void main (String[] args) throws java.lang.Exception
	{
		String text="you are very are handsome";
		String[] words={"you","are" ,"not","handsome"};
		HashSet<String> set = new HashSet<String>();
		for(int i = 0;i < words.length; i++){
			set.add(words[i]);
		}
		char[] charArray = text.toCharArray();
		int start =0;
		
		//can we do it without converting to charArray //Todo
		
		for(int i = 0; i < charArray.length; i++){
			
			if(Character.isWhitespace(charArray[i]) || i == charArray.length-1){
				if(set.contains(text.substring(start,i))){
					//System.out.print(start+"  ");
					  System.out.println(text.substring(start,i));
				}else if(i == charArray.length-1) {
					if(set.contains(text.substring(start,i+1))){
						System.out.print(" "+start);
					}
				}
				else{
					System.out.print("-1"+" ");
				}
				start=i+1;
				
			}
			
			
		}
		
	}
}
