package com.ArrayList;

public class ArrayAddition {

	   public static void main(String args[]){
	        
	        int arr1[] = {9,9,9,9,9,9,9};
	        int arr2[] = {1,6,8,2,6,7};
	        ArrayAddition aa = new ArrayAddition();
	        int result[] = aa.add(arr1, arr2);
	        for(int i=0; i < result.length; i++){
	            System.out.print(" " + result[i]);
	        }
	   }

	private int[] add(int[] arr1, int[] arr2) {
		int l= Math.max(arr1.length,arr2.length);
		int[] result = new int[l];
		int c = 0,r=0;
		int i = arr1.length-1;
		int j = arr2.length-1;
		l--;
		while(i >= 0 &&j >= 0) {
			r = arr1[i--]+arr2[j--]+c;
			c = r/10;
			result[l--] = r%10;
		}
		while(i >= 0) {
			r=arr1[i--]+c;
			c=r/10;
			result[l--]=r%10;
		}
		while(j >= 0) {
			r=arr2[i--]+c;
			c=r/10;
			result[l--]=r%10;
		}
		if(c != 0) {
			 int[] newResult= new int[result.length+1];
			 for(int k=newResult.length-1; k >0; k--){
				 newResult[k]=	result[k-1];
			 }
			 newResult[0]=c;
			 return newResult;
		}
		return result;
	}
}