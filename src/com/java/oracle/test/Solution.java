package com.java.oracle.test;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int T = c.nextInt();
        String[] cases = new String[T];
        for(int j=0;j<T;j++)
        {
        	cases[j]=c.next();
        }
        for (int i = 0; i < cases.length; i++) {
        	if(cases[i].length()%2==0)
        	{
        		String one=cases[i].substring(0,cases[i].length()/2);
        		String two=cases[i].substring(cases[i].length()/2,cases[i].length());
        		System.out.println(substractStrings(one,two));
        	}
        	else
        	{
        		System.out.println("-1");
        	}
        }
	}
	public static int substractStrings(String one,String two)
	{
		char [] oneValues=one.toCharArray();
		
		for(int i=0;i<oneValues.length;i++)
		{
			two=two.replaceFirst(Character.toString(oneValues[i]), "");
			
		}
	
		return two.length()>0?two.length():0;
	}
}
