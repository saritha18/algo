package com.march;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String []args) {
		int[] array= {9,2,3,4};
		reverseArray(array);
		
	}

	private static void reverseArray(int[] array) {
		int start = 0;
		int end  = array.length-1;
		while(start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(array));
	}

}
