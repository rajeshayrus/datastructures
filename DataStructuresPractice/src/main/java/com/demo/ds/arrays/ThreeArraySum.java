package com.demo.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ThreeArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4 };
		System.out.println(threeSum(nums));

	}

	public static List<List<Integer>> threeSum(int[] nums) {

		Collection<List<Integer>> al = new HashSet<List<Integer>>();
		Arrays.sort(nums);
		int mean = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0) {
				mean = i;
				break;
			}
		}
		int i = 0;
		int j = 1;
		int k = j == mean ? mean + 1 : mean;

		while (i < mean) {

			if (j >= k) {
				i++;
				j = i + 1;
				if (j == mean)
					k = mean + 1;
				else
					k = mean;
				continue;
			}
			if (nums[i] + nums[j] + nums[k] == 0) {
				al.add(Arrays.asList(nums[i], nums[j], nums[k]));
				j++;
				k--;
			} else {
				if (nums[i] + nums[j] + nums[k] < 0) {
					k++;
					if (k == nums.length) {
						j++;
						k--;
					}
				}
				if (nums[i] + nums[j] + nums[k] > 0) {
					j++;
					k--;
				}
			}

		}

		if (nums.length - mean > 2 && nums[mean] == 0 && nums[mean + 1] == 0 && nums[mean + 2] == 0)
			al.add(Arrays.asList(nums[mean], nums[mean + 1], nums[mean + 2]));

		return new ArrayList<List<Integer>>(al);

	}

	public static List<List<Integer>> threeSum1(int[] nums) {

		ArrayList<List<Integer>> al = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int mean = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0) {
				mean = i;
				break;
			}
		}
		int i = 0;
		int j = 1;
		int k = j == mean ? mean + 1 : mean;

		while (i < mean) {
			if ((j >= k && k != mean) || k == nums.length) {
				i++;
				j = i + 1;
				if (j == mean && j == k)
					k = mean + 1;
				else
					k = mean;
			} else {
				if (nums[i] + nums[j] + nums[k] == 0) {
					al.add(Arrays.asList(nums[i], nums[j], nums[k]));
					i++;
					j = i + 1;
					k = mean;
				} else {
					if (nums[i] + nums[j] + nums[k] < 0) {
						k++;
						continue;
					}
					if (nums[i] + nums[j] + nums[k] > 0) {
						j++;
						k--;
					}
				}
			}
		}

		if (nums.length - mean > 2 && nums[mean] + nums[mean + 1] + nums[mean + 2] == 0)
			al.add(Arrays.asList(nums[mean], nums[mean + 1], nums[mean + 2]));
		return al;

	}

}
