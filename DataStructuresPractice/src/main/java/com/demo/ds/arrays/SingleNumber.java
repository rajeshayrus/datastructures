package com.demo.ds.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*SingleNumber
 * HAshing
 * 
 * Add the elements to hashset
 * if already exists remove the element
 * return the element left in set
 * 
 * solution 2
 * 
 * Sort the elements
 * iterate the array with i+2
 * comapre the adjacent elements
 * if not equal, return the ith element
 * 
 * */


public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,1,2,1,2};
		System.out.println(singleNumber(nums));

	}

	public static int singleNumber(int[] nums) {
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i = 0; i< nums.length; i++) {
			if(!s.add(nums[i])) {
				s.remove(nums[i]);
				
			}
		}
		
		return (int) new ArrayList<Integer>(s).get(0);

	}

}
