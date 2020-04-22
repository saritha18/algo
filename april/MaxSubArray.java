package com.april;

import java.util.Arrays;

public class MaxSubArray {
	
	public static void main(String []args) {
		int[] array = {-2,1,-3,4,-1,2,1,-5,4};
		int n = array.length;
		int[] temp = new int[n];
		temp[0] = array[0];
		int max = array[0];
		
		for(int i=1;i<n ;i++) {
			temp[i]  = array[i] + (temp[i-1] >  0 ? temp[i-1] : 0);
			max = Math.max(max, temp[i]);
		}
		System.out.println(max);
		System.out.print(Arrays.toString(temp));
	}

}
