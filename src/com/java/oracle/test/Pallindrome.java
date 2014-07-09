package com.java.oracle.test;

import java.io.UnsupportedEncodingException;

public class Pallindrome {
	final static String value="hello";
public static void main(String[] args) throws UnsupportedEncodingException {
	StringBuffer sb=new StringBuffer();
	char[] values=value.toCharArray();
	int k=value.length()-1;
	for(int i=k;i>=0;i--)
	{
		//System.out.println(values[k]);
		sb.append(values[k]);
		k--;
	}
	System.out.println(sb);
	System.out.println(value.getBytes("UTF-16").length);
}

}
