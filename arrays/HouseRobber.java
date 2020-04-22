package com.arrays;

public class HouseRobber {
	
   public static void main(String []args) {
	   HouseRobber house= new HouseRobber();
	   int nums[]= {1,2,3,1,7};
	   System.out.print(house.rob(nums));
	   
	
}
	/* the order is: prev2, prev1, num  */
	public int rob(int[] nums) {
	    if (nums.length == 0) return 0;
	    int prev1 = 0;
	    int prev2 = 0;
	    for (int num : nums) {
	        int tmp = prev1;
	        prev1 = Math.max(prev2 + num, prev1);
	        prev2 = tmp;
	    }
	    return prev1;
	}
}
