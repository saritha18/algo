package com.arrays;
import java.io.*;
import java.util.*;

public class CalenderColumns {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int month = scan.nextInt();
	    int day = scan.nextInt();
	    int numOfDays = getNumberOfDaysInMonth(month);
	    int daysRemaing = 7 - day + 1;
	    int a = numOfDays - daysRemaing;
	    if (a % 7 != 0) {
	       System.out.print(a / 7 + 2);
	    } else {
	       System.out.print(a / 7 + 1);
	    }
		
		
	}
	
	
    
    public static int getNumberOfDaysInMonth(int month) {
        if (month == 2) {
           return 28;
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
           return 31;
        } else {
           return 30;
        }
     }
    
    
  }
	 
	


