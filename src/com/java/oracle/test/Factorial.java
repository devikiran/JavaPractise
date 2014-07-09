package com.java.oracle.test;

public class Factorial {
	public static void main(String[] args) {
	       int n = 7;
	       int result = factorial(n);
	       System.out.println("The factorial of 7 is " + result);
	       
	       
	       int resultGen = 1;
	       for (int i = 1; i <= n; i++) {
	    	   resultGen = resultGen * i;
	       }
	       System.out.println("ResultGen "+resultGen);
	   }

	   public static int factorial(int n) {
	       if (n == 0) {
	           return 1;
	       } else {
	           return n * factorial(n - 1);
	       }
	   }
}
