package com.hackerrank.test;

import java.util.Scanner;


public class APQuestion {
public static void main(String[] args) {
	Scanner c = new Scanner(System.in);
    int T = c.nextInt();
    int[] nums = new int[T];
    for(int j=0;j<T;j++)
    {
    	nums[j]=c.nextInt();
    }
   
	int difference = 0;
			if (nums[2] - nums[1] == nums[1] - nums[0]) {
				difference = nums[1] - nums[0];
			} else {
				if (nums[2] - nums[1] > nums[1] - nums[0])
					System.out.println((nums[2] + nums[1]) / 2);
				else
					System.out.println((nums[0] + nums[1]) / 2);
				return;
			}
			System.out.println(findMissing(nums, 2,  nums.length-1, difference));
	
    
}


public static int findMissing(int[] nums, int min, int max,
		int difference) {
	int middle = (min + max) / 2;
	int predicted = middle * difference + nums[0];
	while (min < max && max < nums.length) {
		if (min == max - 1) {
			//the skipped number is between min and max
			return (nums[min] + nums[max])/2;
		}
		else if (nums[middle] > predicted) {
			// the skipped number is on the left
			return  findMissing(nums, min, middle, difference);
		} else {
			// the skipped number is on the right
			return findMissing(nums, middle, max, difference);
		}
	}
	return (nums[min] + nums[max-1])/2;
}


}
