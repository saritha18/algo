package com.sept;

import java.util.*;
class Concatenate {
 public static void main(String args[] ) throws Exception {
    
     Scanner s = new Scanner(System.in);
     int length= s.nextInt();          // Reading input from STDIN
     int [] array1 = new int[length];
     int [] array2 = new int[length];
      for(int i=0; i<length; i++ ) {
      array1[i] = s.nextInt();
      }

       for(int j=0; j<length; j++ ) {
         array2[j] = s.nextInt();
         array2[j]=array2[j]+array1[j];
      }
      
    
		System.out.println(Arrays.toString(array2));

   

 }
}
