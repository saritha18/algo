package com.inte.am;

public class Majority {
	  public static void main(String[] args) {
		  int input[]=  {3, 3, 4, 2, 4, 4, 2, 4};
		  int n=input.length;
		  System.out.println(findLargest(input,n));
	  }

	private static int findLargest(int[] input, int n) {
		 int count ,maxCount=0,index=0;
		  for(int i=0;i<n;i++) {
			  count=0;
			  for(int j=0;j<n;j++) {
				  if(input[j]==input[i]) 
					  count++;
			  }
			  if(count>maxCount) {
				  maxCount=count;
				  index=i;
			  }
			
		  }
		  if(maxCount > Math.floor(n/2)) 
			  return(input[index]);
		  else
			  return -1;
		
	}

}
