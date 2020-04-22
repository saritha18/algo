package com.march;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElement {
   public static void main(String []args) {
	   int[] nums = {1,1,1,3,3,3,3,4,4,4,4,6,5,9,9,9};
	   int k=2;
	   findTopKElement(nums,k);
   }

	private static List<Integer> findTopKElement(int[] nums, int k) {
		
		Map<Integer,Integer> frequencyMap = new HashMap<Integer,Integer>();
		List<Integer>[] bucket = new ArrayList[nums.length+1];
		
		System.out.println(bucket.getClass().getPackageName());
		
		 for(int n : nums) {
			 frequencyMap.put(n,frequencyMap.getOrDefault(n, 0)+1);
		 }
		 
		 for(int key : frequencyMap.keySet()) {
			 int frequency = frequencyMap.get(key);
			 if(bucket[frequency] == null) {
				 bucket[frequency] = new ArrayList<>();
				 bucket[frequency].add(key);
			 }
			 
		 }
		 
		 List<Integer> res = new ArrayList<>();
		 
		 for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
				if (bucket[pos] != null) {
					res.addAll(bucket[pos]);
				}
			}
			return res;
		 
	}
}
	