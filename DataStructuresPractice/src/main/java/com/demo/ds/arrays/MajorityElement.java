package com.demo.ds.arrays;

import java.util.Arrays;

/*Majority Element
 * 
 * Sort the array
 * return element at nums.length/2 
 * */


public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1,3,1,1,4,1,1,5,1,1,6,2,2};
		System.out.println(majorityElement(n));

	}

	public static int majorityElement(int[] nums) {
		
		if (nums.length == 1)
			return nums[0];
		int count = 0;
		int i = 0;
		Arrays.parallelSort(nums);
		//Simple solution after sorting 
		// return nums.length/2  
		int result = nums[0];
		
		
		if (nums.length < 4) {
			if (nums[0]==nums[1])
				result = nums[0];
			else
				result = nums[2];
			return result;
		}
		else {
			while (count < ((nums.length/2))) {
				if (nums[i] == nums[i+1]) {
					count++;
				} else {
					result = nums[i];
					count = 0;
				}
				i++;
			}
		}
		
		result = nums[i-1];

		return result;

	}
}
