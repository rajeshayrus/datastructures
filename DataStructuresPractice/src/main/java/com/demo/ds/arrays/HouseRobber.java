package com.demo.ds.arrays;

/*House Robber
 * 
 * Dynamic programming
 * 
 * create an array to store sums
 * check the condition for array length
 * Iterate the array
 * calculate sum[i] by taking maximum b/w i-2 and i-3 of sum array after adding ith element of given array
 * 
 * return the max of last two elements of sum array
 * 
 * */


public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2,7,9,3,1, 4, 0, 2 };
		System.out.println(rob(nums));

	}

	public static int rob(int[] nums) {
		int i = 3;

		int[] sum = new int[nums.length];

		if (nums.length < 4) {
			if (nums.length < 3) {
				return nums.length == 2 ? Math.max(nums[0], nums[1]) : nums[0];
			}
			return Math.max(nums[1], nums[0] + nums[2]);
		} else {
			sum[0] = nums[0];
			sum[1] = nums[1];
			sum[2] = nums[0] + nums[2];
		}

		while (i < nums.length) {
			sum[i] = Math.max(nums[i] + sum[i - 2], nums[i] + sum[i - 3]);
			i++;
		}
		return Math.max(sum[nums.length - 1], sum[nums.length - 2]);

	}

}
