package com.sort;

import java.util.Arrays;

public class InsertionSort {
	
	 public static void main(String[] args) {
		  int[] a= {2,3,1,4};
		  InsertionSort insetionObj= new InsertionSort();
		  insetionObj.sort(a);
		  System.out.print(Arrays.toString(a));
	  }

	private void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			System.out.println("key"+key);
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
			System.out.println(a[j+1]);
			System.out.println(Arrays.toString(a));
		}
	}

}
/** Time Complexity
   Worst  - o(n2)
   Best   - 0(n)
   Average - 0(n2)
   
   Space Complexity - o(1)

 
*/
