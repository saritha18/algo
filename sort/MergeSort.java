package com.sort;

public class MergeSort {
	
	public static void main(String[] args) {
		final int[] integerArray=  {5,7,8,2,8,9,3}; 
		mergeSort(integerArray,integerArray.length);
		for (int i = 0; i < integerArray.length; i++)
            System.out.println(integerArray[i]);
	}

	private static void mergeSort(int[] integerArray, int lengthofTheArray) {
		
		if(lengthofTheArray<2)
		  return;
		int mid= lengthofTheArray/2;
		int[] l= new int[mid];
		int[] r= new int[lengthofTheArray-mid];
		
		//populate left and right arrays
		for(int i=0;i<mid;i++) {
			l[i]=integerArray[i];
		}
		for(int i=mid;i<lengthofTheArray;i++) {
			r[i-mid]=integerArray[i];
		}
		mergeSort(l, mid);
	    mergeSort(r, lengthofTheArray - mid);
	    merge(integerArray, l, r, mid, lengthofTheArray - mid);
	}
	
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        System.out.println("inside");
        int i = 0, j = 0, k = 0;
    	long swaps = 0;

        while (i < left && j < right) {

            if (l[i] < r[j])
                a[k++] = l[i++];
            else {
                a[k++] = r[j++];
            }

        }

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];
    }
}
	 

/** Time Complexity :
Best o(nlogn)
Average o(nlogn)
Worst o(nlogn)

Space Complexity

**/

