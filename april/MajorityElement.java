package com.april;

public class MajorityElement {
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] list= {1, 1, 2, 2,1, 3, 1, 4};
		
		int major=list[0],count=1;
		for(int i=1;i< list.length;i++){
			if(count ==0){
				count++;
				major= list[i];
			} else if(major==list[i]){
				count++;
				
			}else{
				count--;
			}
			
		}
		System.out.println(major);
	}
}
