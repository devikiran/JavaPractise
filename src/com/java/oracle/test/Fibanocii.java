package com.java.oracle.test;


public class Fibanocii {
	 static int fibo(int n)
	 {
	  if(n==0)
	   return 0;
	  if(n==1)
	   return 1;
	  else
	   return fibo(n-1)+fibo(n-2);
	  
	 }
	 
	 public static void main(String[] args) {
		/* for(int i=0;i<10;i++)
		  {
		  System.out.print("   "+fibo(i)); 
		  }*/
		 String arr[] = new String[10];
         arr[0] = "one";
         System.out.print(arr[0]);
		 System.out.println(reverse(134));
		 String s="asdf";
		// s.c
		 String result = new StringBuffer(s).reverse().toString();
		 //reversed(123);
	}
	 public static void book(short a) {
		 
	        System.out.print("short ");
	    }
	    
	    public static void book(Short a) {
	        System.out.print("SHORT ");
	    }
	    
	 static void reversed(int number)
	 {
		 int rev=0;
		 int rem=0;
		 do
		 {
			 rem=number%10;
			 rev=rev*10+rem;
			 number=number/10;
		 }while(number>0);
		 
		 
		 System.out.println(rev);
	 }
	 
	 
	 public static long reverse(int number) {
		 long reverse = 0;
		 while (number != 0) {
		 reverse = (reverse * 10) + number % 10;
		 number /= 10;
		 }
		 return reverse;
		 }

}
