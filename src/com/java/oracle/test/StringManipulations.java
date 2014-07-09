package com.java.oracle.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulations {

static String value="Oracle Financials";
public static void main(String[] args) {
	
	String [] words=value.split(" ");
	for(int i=0;i<words.length;i++)
	{
		String value=words[i];
		char c[] = value.toCharArray();
		System.out.println(" ");
		for( int k = c.length -1; k>=0; k--)
		    System.out.print(c[k]);
	}
	
	String stringToMatch = "abccdef";
	Pattern p = Pattern.compile("(\\w)\\1+");
	Matcher m = p.matcher(stringToMatch);
	if (m.find())
	{
	    System.out.println("Duplicate character " + m.group(1));
	}
}

}
