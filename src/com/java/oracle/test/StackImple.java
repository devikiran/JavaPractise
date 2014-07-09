package com.java.oracle.test;



public class StackImple {
	int values[]=new int[4];
	int length=values.length;
	int counter;
	
	public void push(int value)
	{
	if(length>=0)
	{
		values[length-1]=value;
		counter=length-1;
		length--;
	}
	}
	
	public int pop()
	{
		if(counter>0)
		{
		int temp=values[counter];
	
		
		return temp;}
		else
		{
			return 0;
		}
	}

	
	public static void main(String[] args) {
		StackImple sta=new StackImple();
		sta.push(10);
		sta.push(20);
		
		System.out.println(sta.pop());
	}
	

}
