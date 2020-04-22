package com.general;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the activityNotifications function below.
   static double getMedian(int[] counts, int d)
    {  
        int medianIndex=0;
        int medianIndex2 =0;
        if(d%2 == 0){
            medianIndex = d/2;
            medianIndex2 = d/2+1;
        } else {
            medianIndex = d/2+1;
        }
        boolean firstFound = false;
        int count = 0;
        for(int i = 0; i <= 200; i++){
            count += counts[i];
            if(medianIndex <= count && d%2 == 1){
                return i;
            } else if (medianIndex <= count && !firstFound){
                firstFound = true;
                medianIndex = i;
            } 

            if(medianIndex2 <= count && d%2 == 0){
                return (medianIndex + i)/2.0;
            }
        }
        return -1;
    }  

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int[] counts = new int[201];
        int notificationCount = 0;
        for(int i = 0; i < expenditure.length; i++){
            if(i <= d-1){
                counts[expenditure[i]]++;
            }else {
                double median = getMedian(counts, d);
                System.out.println(median);
                if(expenditure[i] >= median*2)
                    notificationCount++;
                counts[expenditure[i-d]]--;
                counts[expenditure[i]]++;
            }
            
        }
        return notificationCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	   /* Scanner in = new Scanner(System.in);
        int n = in.nextInt();*/
        int d = 2;
        int[] expenditure = {2,5,1,10};
        		//new int[n];
      /*  for(int i = 0; i < n; i++){
            expenditure[i] = in.nextInt();
        }*/
        int result = activityNotifications(expenditure, d);
        System.out.println(result);
        //in.close();
     
    }
}
