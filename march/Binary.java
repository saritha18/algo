package com.march;

class Binary { 
	  
	// Function to convert decimal  
	// to binary number  
	static void bin(Integer n)  
	{  
	    if (n > 1)  
	    bin(n>>1);  
	      
	    System.out.printf("%d", n & 1);  
	}  
	  
	// Driver code  
	  public static void main(String[] args) { 
	       // bin(131);  
	    System.out.printf("\n");  
	    bin(3); 
	    } 
	} 

/*
import java.util.Scanner;
public class Convert
{
    public static void main(String[] args) 
    {
        int n, count = 0, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
            }
            x = a + "" + x;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
        System.out.println("No. of 1s:"+count);
    }
}*/