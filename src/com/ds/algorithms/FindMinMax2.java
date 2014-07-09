package com.ds.algorithms;

public class FindMinMax2
{
 public static void main(String[] args)
 {
//  int[] arr = {4, 3, 5, 1, 2, 6, 9, 2, 10, 11, 12};
	 int[] arr = {4, 3};
  MinMax result = findMinMaxRecursive(arr, 0, arr.length - 1);
  System.out.println("maximum= " + result.max);
  System.out.println("minimum= " + result.min);
 }

 private static MinMax findMinMaxRecursive(int[] arr, int i, int j)
 {
  if (i > j)
   return null;
  if (i == j)
   return new MinMax(arr[i], arr[i]);
  else
  {
   MinMax left;
   MinMax right;
  
   left = findMinMaxRecursive(arr, i, (i + j) / 2);
   System.out.println("left : "+left);
   right = findMinMaxRecursive(arr, (i + j) / 2 + 1, j);
   System.out.println("right : "+right);
   if (left == null)
    return right;
   else if (right == null)
    return left;
   else
   {
    return new MinMax(Math.min(left.min, right.min), Math.max(
      left.max, right.max));
   }
  }
 }
}

class MinMax
{
 public int min;
 public int max;

 public MinMax(int min, int max)
 {
  this.min = min;
  this.max = max;
 }

@Override
public String toString() {
	return "MinMax [min=" + min + ", max=" + max + "]";
}
 
 
}        