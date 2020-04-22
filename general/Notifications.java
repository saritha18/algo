package com.general;
import java.util.Scanner;

public class Notifications {
    public static int activityNotifications(int[] expenditure, int d){
        int[] count = new int[201];
        int result = 0;
        for(int i = 0; i < d; i++){
            count[expenditure[i]]++;
        }
        for(int i = d; i < expenditure.length; i++){
            int median = getMedian(count, d);
            if(median <= expenditure[i]){
                result++;
            }
            count[expenditure[i-d]]--;
            count[expenditure[i]]++;
        }
        return result;
    }
    public static int getMedian(int[] count, int d){
        int sum = 0;
        for(int i = 0; i < count.length; i++){
            sum += count[i];
            if((2*sum) == d){
                return (2*i+1);
            }else if((2*sum) > d){
                return (i*2);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
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

