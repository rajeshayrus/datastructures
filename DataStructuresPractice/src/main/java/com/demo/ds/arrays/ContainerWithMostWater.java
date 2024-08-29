package com.demo.ds.arrays;


/*Container With Most Water
 * 
 * Two Pointer pattern
 * complexity O(n)
 * 
 * Iterate Two Pointers from start and end
 * Calculate the area and consider maximum area compared with previous area
 * if height at first pointer is less, move the first pointer 
 * else move second pointer
 * */

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,4,5,18,17,6};
		System.out.println(maxArea(a));

	}

	public static int maxArea(int[] height) {
		
		int first = 0;
		int second = height.length-1;
		int area = 0;
		while (first < second) {
			area = Math.max(area, (second - first) * Math.min(height[second],height[first]));
			if (height[first] < height[second]) {
				first++;
			}
			else{
				second--;
			}
		}
		return area;

	}
}
