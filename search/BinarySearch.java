package com.search;

public class BinarySearch {
	 
	 public static void main(String[] args) { 
		 final int[] integerArray= {1,2,30,40,50,60,80};
		 int elementToBeSearched= 60;
		 BinarySearch binarySearch= new BinarySearch();
		 int result=binarySearch.search(integerArray,elementToBeSearched);
		 if(result==-1) {
			 System.out.print("Not Found");
		 }else {
			 System.out.println("Element Found at this index "+result);
		 }
		 
	 }
	 private int search(int[] integerArray, int elementToBeSearched) {
		     int l=0,r= integerArray.length-1;
		      while(l<=r) {
		    	  int m=l+(r-1)/2;
				  if(integerArray[m]==elementToBeSearched)
					  return m;
				  if(integerArray[m]<elementToBeSearched)
					   l=m+1;
				  else
					  r=m-1;
		 }
			return -1;
		
	}
 }
	
/*
 * Time Complexity 
 * 
 * Best Case is o(1)
 * Worst Case is o(log n)
 */
  
// Space Comlexity is o(1)



