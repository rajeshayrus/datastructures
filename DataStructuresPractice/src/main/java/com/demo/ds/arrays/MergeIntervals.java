package com.demo.ds.arrays;

import java.util.Arrays;

/*MergeIntervals
 * 
 * SOrting and traversing
 * 
 * Sort the given array
 * create an result array and assign [0] value
 * compare and merge the intervals array with result
 * count the size of result array
 * create new result array of length size and copy values 
 * 
 * */

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][] = {{1,3},{2,6},{8,10},{15,18}};
		//int nums[][] = { { 1, 3 } };
		//int nums[][] = { { 1, 4 }, { 4, 5 } };
		//int nums[][] = { { 1, 4 }, { 0,0 } };
		//int nums[][] = {{1,4},{0,2},{3,5}};
		int result[][] = merge(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i][0] + "	" + result[i][1]);
		}

	}

	public static int[][] merge(int[][] intervals) {
		int index = 0;
		int i = 1;
		
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
		int size = 1;
		while (i < intervals.length) {
			if (intervals[index][1] >= intervals[i][0]) {
				intervals[index][1] = Math.max(intervals[i][1], intervals[index][1]);
				i++;
			}
			else {
				index++;
				intervals[index][0] = intervals[i][0];
				intervals[index][1] = intervals[i][1];
				i++;
				size++;
			}
		}
		int result1[][] = new int[size][2];

		for (int i1 = 0; i1 < size; i1++) {
			result1[i1][0] = intervals[i1][0];
			result1[i1][1] = intervals[i1][1];
		}
		return result1;

	}

	public static int[][] merge1(int[][] intervals) {

		int result[][] = new int[intervals.length][2];
		int count = 0;
		int i = 1;
		
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
		result[count] = intervals[0];
		int size = 1;
		while (i < intervals.length) {
			if (result[count][1] >= intervals[i][0]) {
				result[count][1] = Math.max(intervals[i][1], result[count][1]);
				i++;
			}
			else {
				count++;
				result[count][0] = intervals[i][0];
				result[count][1] = intervals[i][1];
				i++;
				size++;
			}
		}
		count = Math.max(count, size);
		int result1[][] = new int[count][2];

		for (int i1 = 0; i1 < size; i1++) {
			result1[i1][0] = result[i1][0];
			result1[i1][1] = result[i1][1];
		}
		return result1;

	}

}
