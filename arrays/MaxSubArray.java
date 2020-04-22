package com.arrays;
//kadane alogorithm
public class MaxSubArray {
    public static void main(String []args) {
    	
    	int input[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
    	int size = input.length;
    	MaxSubArray max= new  MaxSubArray();
    	System.out.print(max.findMaxSubArray(input,size));
    }

	private int findMaxSubArray(int[] input, int size) {
		int max_till = 0, max_end = 0;  
		for(int i=0;i<size;i++) {                        
			max_end=max_end+input[i];
			if(max_end<0) max_end=0;
			else if(max_till< max_end) {
				max_till= max_end;
			}
		}
		return max_till;
		
	}
}


/*int max_so_far = a[0]; 
int curr_max = a[0]; 

for (int i = 1; i < size; i++) 
{ 
    curr_max = Math.max(a[i], curr_max+a[i]); 
    max_so_far = Math.max(max_so_far, curr_max); 
} 
return max_so_far; 

} */

//Time Complexity is o(n)