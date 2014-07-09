package com.ds.algorithms;

public class StringToNumber {
	public static void main(String[] args) {
		System.out.println( StringToNumber.convertStringToInt("9988"));
	}
	public static int convertStringToInt(String num){
		int result=0;
		int zeroAscii=48;
		int nineAscii=57;
		for(char c: num.toCharArray()){
		  if(c>=zeroAscii && c<=nineAscii){
		  result=result*10+(c-zeroAscii);
		  System.out.println(result);
		 }else
		  return -1;
		 }
		return result;
		}
}
