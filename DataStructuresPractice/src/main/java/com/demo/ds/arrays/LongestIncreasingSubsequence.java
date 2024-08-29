package com.demo.ds.arrays;

import java.util.Stack;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10,9,2,5,3,7,101,18  };
		System.out.println(lengthOfLIS(nums));

	}

	public static int lengthOfLIS(int[] nums) {
		
		int i = 1, min = nums[0], length = 1;
		Stack<Integer> s = new Stack<Integer>();
		s.push(nums[0]);
		
		while (i < nums.length) {
			if (nums[i] > s.peek()) {
				s.push(nums[i]);
				i++;
			} else {
				if (nums[i] < min) {
					length = Math.max(length, s.size());
					s.removeAllElements();
					s.push(nums[i]);
					min = nums[i];
					i++;
				} else if (nums[i] == min) {
					i++;
				}
				else {
					while(s.peek() > nums[i]) {
						s.pop();
					}
					s.push(nums[i]);
					i++;
				}
			}
		}
		
		return Math.max(length, s.size());

	}

}
