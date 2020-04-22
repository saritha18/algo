package com.inte.am;

public class MooreMajority {

	public static void main(String[] args) {
		int input[]=  {3, 3, 4, 2, 4, 4, 2, 4};
		MooreMajority majorityElement = new MooreMajority();
		majorityElement.findMajority(input,input.length);
	}

	private void findMajority(int[] input, int length) {
		
		int cand=findCandidate(input,length);
		
		if(isMajority(input,length,cand)) {
			System.out.println(cand);
		}else {
			
			System.out.println("No majoirty Element");
		}
	}

	private boolean isMajority(int[] input, int length, int cand) {
		int i,count=0;
		for(i=0;i<length;i++) {
			if(input[i]==cand) 
				count++;
		}
		if(count>length/2)
			return true;
		else
			 return false;
	}

	private int findCandidate(int[] input, int length) {
		int majIndex=0,count=1;
		int i;
		for(i=1;i< length;i++) {
			if(input[majIndex]==input[i]) {
				count++;
			}
			else {
				count--;
			}
			if(count==0) {
				majIndex=i;
				count=1;
			}
		}
		return input[majIndex];
	}
}
