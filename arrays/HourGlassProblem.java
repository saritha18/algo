package com.arrays;

import java.util.Scanner;

public class HourGlassProblem {
	public static void main(String[] args) {
	        int[][] matrix=new int[6][6];
	        Scanner in = new Scanner(System.in);
	        for(int i=0;i<6;i++){
	            String[] tmp=in.nextLine().split(" ");
	            int j=0;
	            for(String s:tmp){
	                matrix[i][j++]=Integer.parseInt(s);
	            }
	        }
	        int maxScore=-999990;
	        for(int i=0;i<4;i++){
	            for(int j=0;j<4;j++){
	                int tmp=matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j+1]+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
	                maxScore=Math.max(maxScore,tmp);
	            }
	        }
	        System.out.println(maxScore);
	    }
}