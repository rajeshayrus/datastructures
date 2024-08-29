package com.demo.ds.arrays;

import java.util.Arrays;

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { -1, -1, 1 };
		System.out.println(subarraySum(nums, 0));

	}

	public static int subarraySum(int[] nums, int k) {

		int i = 0, j = 0, sum = 0, result = 0;

		while (i < nums.length) {
			if (j < nums.length) {
				if (sum + nums[j] == k) {
					sum = sum + nums[j];
					result++;
					j++;
				} else {
					sum = sum + nums[j];
					j++;
				}
			} else {
				i++;
				j = i;
				sum = 0;
			}
		}

		return result;

	}

}
