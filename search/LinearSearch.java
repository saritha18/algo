package com.search;

public class LinearSearch {

   private static final int[] integerArray= {1,39,403,22};
   private static int elementToBeSearched= 22 ;
   public static void main(String[] args) { 
	   LinearSearch linearSearch = new LinearSearch();
	   linearSearch.linearSerach(integerArray);
	 
   }
	private void linearSerach(int[] arrayToBeSearched) {
		for(int i=0;i<integerArray.length;i++) {
			   if(integerArray[i]==elementToBeSearched) {
				  System.out.print("Index"+i);
			   }
				   
		}
	}
}



/*
	
	Time Complexity of Linear Search is
	
	BestCase = o(1)
	Worst Case=o(n)
	Average Case=n(n+1)/2n=o(n)

*/


/*
 *  Space Complexity of Linear Search is o(1)
 * a space complexity of O(1) means that the space required by the algorithm to process
 *  data is constant; it does not grow with the size of the data on which
   the algorithm is operating.
 */
