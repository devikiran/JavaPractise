package com.ds.algorithms;

public class ATMDenomination {

	 int denominations[]={1000,500,100,50,20,10,5,2,1};
	 
	 public void denominations(int value)
	 {
		 int count =0;
		 int number=0;
		 for(int i=0;i<denominations.length;i++)
		 {
			  number=value/denominations[i];
			  if(number!=0)
			  System.out.println("Number of "+denominations[i]+"in the value is "+number);
			  
				  value=value%denominations[i];
			 
		 }
	 }
	 public static void main(String[] args) {
		new ATMDenomination().denominations(4500);
	}
}
