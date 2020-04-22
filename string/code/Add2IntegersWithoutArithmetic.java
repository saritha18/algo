package com.string.code;

public class Add2IntegersWithoutArithmetic {
  public static void main(String []args) {
	  Add2IntegersWithoutArithmetic add= new Add2IntegersWithoutArithmetic();
	  System.out.println(add.addInt(119,222));
  }

private int addInt(int i, int j) {
	// TODO Auto-generated method stub
	while(j!=0) {
		int carry= i & j;
		i=i^j;
		j=carry<<1;
	}
	return i;
}
}

//recursive method
/*
int Add(int x, int y)
{
    if (y == 0)
        return x;
    else
        return Add( x ^ y, (x & y) << 1);
}*/