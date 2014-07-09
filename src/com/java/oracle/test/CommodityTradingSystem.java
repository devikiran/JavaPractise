package com.java.oracle.test;

public class CommodityTradingSystem extends TradingSystem{
	   public String getDescription(){
		     return "Futures trading system";
		   }
	   
	   
	   public static void main(String[] args) {
		TradingSystem ts=new DirectMarketAccessSystem();
		System.out.println(ts.getDescription());
	}
		}


