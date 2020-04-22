package com.general;

public class Nthroot {

    public static void main(String[] args) {
    	Double base= 125.0;
    	Double n= 3.0;
    	Nthroot root= new Nthroot();
    	Double result=root.calculate(base, n);
    	System.out.println(result);
    	
    }
	
    private Double calculate(Double base, Double n) {
    			return Math.pow(Math.E, Math.log(base)/n);
	}
    
   
	
}

//nth root of a number x = x^(1/n)=e^(lnx/n)
