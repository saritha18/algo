package com.string.code;

import java.util.Stack;

public class BackSpaceString {
  public static void main(String[]args) {
	  BackSpaceString backSpace= new BackSpaceString();
	  String s="ab#c", y="acb#";
	  System.out.print(backSpace.validate(s,y));
	  
  }

private boolean validate(String s, String y) {
	 if (s== null || y == null) return false;
	 return iterateandFind(s).equals(iterateandFind(y));
	
}

private String iterateandFind(String s) {
	char[] charArray= s.toCharArray();
	Stack<Character> stack= new Stack<>();
	for(char c: charArray) {
		if(c!='#') stack.push(c);
		else if (!stack.isEmpty()) stack.pop();
	}
	StringBuffer sb = new StringBuffer();
	while (!stack.isEmpty()) sb.append(stack.pop());
    return sb.toString();
 }
}
