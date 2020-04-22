package com.april;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
	public static void main(String [] args) {
		/*char c;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		do {
			c=(char)obj.read();
			System.out.println(c);
		}while(c!= \"");
		*/
		StringBuffer s1= new StringBuffer("Hello world");
		s1.insert(6, "Good");
		System.out.println(s1);
	}
     
}
