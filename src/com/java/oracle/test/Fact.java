package com.java.oracle.test;

public class Fact {
	static int val=8;
public static void main(String[] args) {
	System.out.println(fact(7));
}

static int fact(int number)
{
	if(number==0)
	{
		return 1;
	}
	else
	{
		return number*fact(number-1);
	}
}
}
