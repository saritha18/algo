package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int lengthOfArray= in.nextInt();
        int shiftAmount= in.nextInt();
        int []a= new int[lengthOfArray];
        for(int i = 0; i < lengthOfArray; i++){
            int newLocation = (i + (lengthOfArray - shiftAmount)) % lengthOfArray;
            a[newLocation] = in.nextInt();
        }
        System.out.println(Arrays.toString(a));
	}
  
}
