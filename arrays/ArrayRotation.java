package com.arrays;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		
		ArrayRotation rotation= new ArrayRotation();
		rotation.leftRotate(new int[] {1,2,3,4,5,6,7}, 2);
		rotation.rotate(new int[] {1,2,3,4,5,6,7}, 2);
		
		// java8
	/*	
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
		    list.add(array[i]);
		}
		Collections.rotate(list, 2);
		int[] res = list.stream().mapToInt(i -> i).toArray();
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]);
		}*/
	
	}  
	    private void rotate(int[] array, int i) {
		// TODO Auto-generated method stub
	    	
		
	}
		private  void leftRotate(int[] inputArray, int n) 
	    {
	        System.out.println("Input Array Before Rotation :");
	        
	        System.out.println(Arrays.toString(inputArray));
	        
	        int temp;
	        
	        for (int i = 0; i < n; i++)
	        {
	            temp = inputArray[0];
	            
	            for (int j = 0; j < inputArray.length-1; j++) 
	            {
	                inputArray[j] = inputArray[j+1];
	            }
	            
	            inputArray[inputArray.length - 1] = temp;
	        }
	        
	        System.out.println("Input Array After Left Rotation By "+n+" Positions :");
	        
	        System.out.println(Arrays.toString(inputArray));
	    }
	    
}  
	
