package com.java.oracle.test;


public class Sample {
	public static void hello(String val)
	{
		System.out.println(val+"String");
	}
	
	public static void hello(int val)
	{
		System.out.println("int"+val);
	}
	

	public static void main(String[] args) {
	/*	int i=5;
		System.out.println(Integer.valueOf(i).MAX_VALUE);*/
/*
		
		StringBuilder sb= new StringBuilder("Good Morning.");
		System.out.println(sb.capacity());
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n+"Input value ");*/
		//hello(null);
/*		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if((i-j<=0)&&(i+j<=8))
				{
					System.out.printf("*");
				}
				else
				{
					System.out.printf(" ");
				}
				
			}
			System.out.println();
		}*/
		System.out.println(new Sample().reverse("1234"));
	}
	
	public Object reverse(String value)
	{
		String rev="";
		char[] valuess=value.toCharArray();
		System.out.println(value.length());
		for(int i=value.length()-1;i>=0;i--)
		{
			
			rev=rev+valuess[i];
		}
		
		return rev;
	}
	

}
