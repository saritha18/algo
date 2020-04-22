package com.sept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDiff {
   public static void main(String []args) {
	   MinimumAbsoluteDiff diff = new MinimumAbsoluteDiff();
	   int[] array = {1, -3, 71, 68, 17};
	   diff.minimumAbsDifference(array);
   }

private List<List<Integer>> minimumAbsDifference(int[] input) {
	int min=Integer.MAX_VALUE;
	Arrays.sort(input);
	List<List<Integer>> res = new ArrayList();
	List<Integer> array= new ArrayList<Integer>();
	for(int i=0;i<input.length-1;i++) {
		int diff=input[i+1]-input[i];
		if(diff<min) {
			min=diff;
			res=new ArrayList();
			res.add(Arrays.asList(input[i],input[i+1]));
		}else if(diff==min) {
			res.add(Arrays.asList(input[i], input[i + 1]));
		}
	}
   return res;
 }
}
