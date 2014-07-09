package com.java.oracle.test;

import java.lang.reflect.Array;

public class Hotel {

   /* public static void main(String args[]) {    
    	 Object myObj = new String[]{"one", "two", "three"};{
    		          for (String s : (String[])myObj) System.out.print(s + ".");
    		     }
    }   */
	public static void printB(String str) {
        System.out.print(Boolean.valueOf(str) ? "true" : "false"); 
      Hotel h=new Hotel();
   }
   
   public static void main(String args[]) {
	   String str = null;
       if (str.length() == 0) {
           System.out.print("1");
       } else if (str == null) {
           System.out.print("2");
       } else {
           System.out.print("3");
       }
   }
   
  
}   
