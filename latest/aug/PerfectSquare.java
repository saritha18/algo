package com.latest.aug;

public class PerfectSquare {
    
    public static void main(String[] args) {
    	int n=81;
    	PerfectSquare square= new PerfectSquare();
    	square.findIsPerfect(n);
    
    }

	private boolean findIsPerfect(int n) {
		long num=n;
	    if(n==1)return true;
	    if(n<1) return false;
	    long low=1,high=n/2,mid=0;
	    while(low<=high) {
	    	mid=low+(high-low)/2;
	    	if(mid*mid==num) 
	    		return true;
	    	else if((mid*mid)<num) 
	    		low=mid+1;
	    	else
	    		high=mid-1;
	    }
		return false;
	}
    
}
