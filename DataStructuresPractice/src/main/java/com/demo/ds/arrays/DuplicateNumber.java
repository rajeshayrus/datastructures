package com.demo.ds.arrays;

import java.util.HashSet;

/*Duplicate Number
 * 
 * Hashing technique
 * complexity O(n)
 * 
 * Add values to hashset
 * if it returns false, return the number - it is duplicate
 * 
 * */


public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}
	
public static int findDuplicate(int[] nums) {
	
	HashSet<Integer> hs = new HashSet<Integer>();
	for (int num : nums ) {
		if (!hs.add(num))
			return num;
	}
	return 0;
        
    }

}
