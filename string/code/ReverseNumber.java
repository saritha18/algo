package com.string.code;

public class ReverseNumber {
 public static void main(String []args) {
	 ReverseNumber rs= new ReverseNumber();
	 System.out.print(rs.reverse(1237890110));
	 	 
 }

private int reverse(int i) {
	try {
	boolean isNeg= i < 0;
	if(isNeg) {
		i=Math.abs(i);
	}
	String num="";
	while(i!=0) {
		num+=String.valueOf(i%10);
		i=i/10;
	}
	if(isNeg) {
		num="-"+num;
	}
	return Integer.parseInt(num);
   }
	catch(Exception e){
		return 0;
	}
}
}