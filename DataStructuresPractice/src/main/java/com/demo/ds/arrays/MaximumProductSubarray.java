package com.demo.ds.arrays;

import java.util.Arrays;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3,-1,4};
		System.out.println(maxProduct(nums));

	}

public static int maxProduct(int[] nums) {
		
		
		int[] r = new int[nums.length];
		int i = 1, count = 0;
		int product = nums[0] == 0 ? 1 : nums[0];
		r[0] = nums[0];
		count++;
		
		while (i < nums.length) {
			if (nums[i] > 0) {
				product = product * nums[i];
				r[count] = product;
			} else if (nums[i] < 0) {
				int p = nums[i];
				if ( r[count-1] * nums[i] > 0) {
					r[count] = r[count-1] * nums[i];
					product = r[count];
					
				}else {
					r[count] = Math.max(nums[i], nums[i-1] * nums[i]);
					product = r[count];
				}
			} else {
				r[count] = 0;
				product = 1;
			}

			count++;
			i++;
		}
		return Math.max(Arrays.stream(r).max().getAsInt(), nums[i-1]);

	}
	
	
	
	public static int maxProduct1(int[] nums) {
		
		
		int[] r = new int[nums.length];
		int i = 1, count = 0;
		int product = nums[0] == 0 ? 1 : nums[0];
		r[0] = nums[0];
		count++;
		
		while (i < nums.length) {
			if (nums[i] > 0) {
				product = product * nums[i];
				r[count] = product;
			} else if (nums[i] < 0) {
				int p = nums[i];
				boolean added = false;
				for (int j = count-1; j >= 0; j-- ) {
					p = r[j] * p;
					if (p == 0)
						break;
					if (p > 0) {
						r[count] = p;
						product = p;
						added = true;
						break;
					}
				}
				if (!added) {
					r[count] = r[count-1] * nums[i];
					product = 1;
				}
			} else {
				r[count] = 0;
				product = 1;
			}

			count++;
			i++;
		}
		return Arrays.stream(r).max().getAsInt();

	}
}
