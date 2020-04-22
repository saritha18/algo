package com.sort;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
	  int[] a= {2,3,1,4};
	  SelectionSort selection= new SelectionSort();
	  selection.sort(a);
	  System.out.print(Arrays.toString(a));
  }
	
	private void sort(int[] a) {
		int length=a.length;
		int min;
		for(int i=0;i<length-1;i++) {
			min=i;
			for(int j=i+1;j<length;j++) {
				if(a[j]<a[min]) {
					min=j;
					int temp=a[min];
					 a[min]=a[i];
				     a[i]=temp;
				}
				
			}
		}
		
	}
}

/*  Time Complexity 
 *  Best Case : 0(n2)
 *  Average   : 0(n2)
 *  Worst     : 0(n2)
 *  
 *  Space Complexity:
 *  
 *  Comparison sort
 *  Not stable
 *  in place-- yes
 *  
 *  
 */

