package com.java.oracle.test;
/**
 * 
 * @author devikira
 *
 */
public class BubbleSort {
 int [] values;
 public BubbleSort(int inputValues[]) {
	 
	 this.values=inputValues;
  }
 
 public  int[] sort()
 {
	 boolean flagVariable;
	 do{
		 flagVariable=false;
		 for(int i=0;i<values.length-1;i++)
		 {
			 if(values[i+1]<values[i])
			 {
				 int tmp=values[i+1];
				 values[i+1]=values[i];
				 values[i]=tmp;
				 flagVariable=true;
			 }
		 }
		 
	 }while(flagVariable);
	 
	 
	 
	 
	 return  values;
 }
 
 public static void main(String[] args) {
	 
	 int [] data={90,30,50,75};
	BubbleSort bs=new BubbleSort(data);
	for(int temp:bs.sort())
	{
		System.out.println(temp);
	}
	
}
 
 
}
