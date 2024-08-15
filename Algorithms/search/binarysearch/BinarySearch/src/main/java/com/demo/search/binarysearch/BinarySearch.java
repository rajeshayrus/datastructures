package com.demo.search.binarysearch;

public class BinarySearch {

	public static int binarySearch(int[] array, int key) {
		
		int low = 0;
		int high = array.length-1;
		int mid = 0;
		while(low<=high) {
			mid = (low + high)/2;
			if(array[mid]==key)
				return mid;
			if(array[mid]>key) {
				high = mid-1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return -1;
	}
}
