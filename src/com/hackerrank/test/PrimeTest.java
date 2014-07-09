package com.hackerrank.test;

import java.util.Scanner;

public class PrimeTest{
    private static final int MAX_NUM = 100; // your big number

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int res;
    	int _a;
    	_a = in.nextInt();
    	res = getNumberOfPrimes(_a);
    	System.out.println(res);
    }
    
    
    
    
    
     static int getNumberOfPrimes(int N) {
        int count = 0;
        for(int i=0; i<N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }


    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i=2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}