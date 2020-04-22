package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

class FindDuplicate 
{ 

    public static void main(String[] args)  
    { 
    	int count=0;
    	Scanner scan = new Scanner(System.in);
    	int n= scan.nextInt();
    	int a[]= new int[n];
    	for(int i=0;i<n;i++) {
    		a[i]=scan.nextInt();
    	}
    	/*Set<Integer> elements= new HashSet<>();
    	//BruteForce Method --Compare each element with the entire array -- o(n2) time complexity
    	for(int i=0;i<a.length;i++) {
    		for(int j=1;j<a.length;j++) {
    			if(a[i]==a[j] && i!=j) {
    				elements.add(a[i]);
    			}
    		}
    	}
    	System.out.println(elements.size());*/
    //	List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
    	/* Set<Integer> set = new HashSet<>();  //o(n) solution
    	 Set<Integer> duplicates= new HashSet<>();
    	for (int t: a){
            if (!set.add(t)) {
            	duplicates.add(t);
            }
                
        } System.out.print(duplicates.size());*/
    	
    	
    	   HashMap<Integer, Integer> map = new HashMap<>();
           
    	    for (int element : a) 
    	    {   
    	        if(map.get(element) == null)
    	        {
    	            map.put(element, 1);
    	        }
    	        else
    	        {
    	            map.put(element, map.get(element)+1);
    	        }
    	    }
    	         
    	    Set<Entry<Integer, Integer>> entrySet = map.entrySet();
    	         
    	    for (Entry<Integer, Integer> entry : entrySet) 
    	    {               
    	        if(entry.getValue() > 1)
    	        {
    	           count++;
    	        }
    	    }
    	
    	   System.out.print(count);
       //Solution 1
    	
       /* 
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++) {
        	if(set.add(arr[i])==false) {
        		System.out.println(arr[i]);
        	}
        }*/
    	
    	// solution 2
    	
    	/*Arrays.sort(arr);

    	for(int i = 1; i < arr.length; i++) {
    	    if(arr[i] == arr[i - 1]) {
    	        System.out.println("Duplicate: " + arr[i]);
    	    }
    	}*/
    	
    	
    	//int[] arrayWithOutDuplicates= Arrays.stream(arr).distinct().toArray();
    	
    	
    } 
} 