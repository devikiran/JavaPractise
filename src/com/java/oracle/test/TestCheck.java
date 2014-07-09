package com.java.oracle.test;

public class TestCheck {
	
	public static void main(String[] args) {
		System.out.println(new TestCheck().reverse("DeviKiranSetti"));
	}
	public  String reverse(String actual)
	{String rev = "";
		if(actual.length()==1)
		{
			return actual;
		}
		else
		{
			rev+=actual.charAt(actual.length()-1) +reverse(actual.substring(0,actual.length()-1));
		}
		return rev;
	}

}
