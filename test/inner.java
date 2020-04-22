package com.test;

public class inner {
   static int i;
   static {
	   int i=5;
   }
   public static void main(String[] args) {
	   System.out.println(inner.i);
   }
}
