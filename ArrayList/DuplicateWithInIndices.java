package com.ArrayList;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a function that determines whether a array contains duplicate 
 * characters within k indices of each other
 */
public class DuplicateWithInIndices {

    public boolean duplicate(int arr[],int k){
    	  HashSet<Integer> set = new HashSet<>(); 
    	  
          // Traverse the input array 
          for (int i=0; i<arr.length; i++) 
          { 
              // If already present n hash, then we found  
              // a duplicate within k distance 
              if (set.contains(arr[i])) 
                 return true; 
    
              // Add this item to hashset 
              set.add(arr[i]); 
    
              // Remove the k+1 distant item 
              if (i >= k) 
                set.remove(arr[i-k]); 
          } 
          return false; 
      }
      
      public static void main(String args[]){
          int arr[] = {1,2,3,4,11,5,6,4};
          DuplicateWithInIndices dk = new DuplicateWithInIndices();
          System.out.println(dk.duplicate(arr, 3));
      }
}
