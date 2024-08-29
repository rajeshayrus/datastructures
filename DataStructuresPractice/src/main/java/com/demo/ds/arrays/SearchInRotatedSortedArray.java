package com.demo.ds.arrays;

/*Search in Rotated Sorted Array
 * 
 * Divide and conquer or (Binary search)
 * 
 * Find the pivot k
 * Decide the which part of array has to be searched by below condition
 * target < nums[0]
 * if true
 * 	second part
 *else 
 *	first part
 *Assign the variables based on above result
 *Perform binary search operation on the decided part of array
 * 
 * 
 * */

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4,5,6,7,0,1,2 };
		System.out.println(search(nums, 7));

	}

	public static int search(int[] nums, int target) {
		
		int k = nums.length-1;
		
		for (int i = 0; i < nums.length-2; i++) {
			if(nums[i] > nums[i+1]) {
				k = i+1;
				break;
			}
		}
		System.out.println(k);
		int i = 0;
		int j = nums.length-1;
		
		//Decide which part of array to search
		if(target < nums[0]) {
			//second part
			i = k;
			j = nums.length-1;
		} else {
			//First part
			j = k;
		}
		
		while ( i <= j) {
			k = (i + j)/2;
			if (target == nums[k]) 
				return k;
			if (target > nums[k]) {
				i = k+1;
			} else {
				j = k-1;
			}
		}
		
		return -1;

	}

}
