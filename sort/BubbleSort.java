package com.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String []args) {
		int a[] = {1,223,2};
		BubbleSort obj= new BubbleSort();
		obj.sort(a);
	}
	
	private void sort(int[] inputArray) {
		boolean swapped;
		int temp;
		for(int i=0;i<inputArray.length;i++) {
			swapped=true;
			for(int j=1;j<inputArray.length-i;j++) {
				if(inputArray[j-1]>inputArray[j]) {
					temp=inputArray[j-1];
				    inputArray[j-1]=inputArray[j];
				    inputArray[j]=temp;
				    swapped=false;
				}
			}
			if(swapped) {
				System.out.println("sorted");
				break;
		}
		
		System.out.println(Arrays.toString(inputArray));
		
	}
  }
}

/**  Best case is o(n)
	 worst case is o(n2)
	 space complexity 0(1)
	 Stable sort --yes
	 in place -- yes
 */
