package com.hackerrank.test;

public class ATMDenotation {
public static void main(String[] args) {
	new ATMDenotation().getDenominations(4500);
}

public void getDenominations(int value)
{
	 int denominations[]={1000,500,100,50,20,10,5,2,1};
	 
	 int count=0;
	 for(int i=0;i<denominations.length;i++)
	 {
		count=value/denominations[i];
		if(count!=0)
		System.out.println("value is "+denominations[i]+"Count is "+count);
		
		value=value%denominations[i];
		
	 }
	 
}
}
