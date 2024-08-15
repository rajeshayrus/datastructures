package com.demo;

public class QuickSort {

	public static int[] result = new int[10];
	public static int partition(int[] arr, int low, int high) {
		int n = high;
		int pivot = low;
		for(int i = low+1; i<= n; i++) {
			if(arr[pivot]>arr[i]) {
				int temp = arr[i];
				arr[i] = arr[pivot+1];
				arr[pivot+1] = arr[pivot];
				arr[pivot] = temp;
				pivot++;
			}
		}
		result[pivot] = arr[pivot];
		return pivot;
		
	}
	public static void sort(int[] arr, int low, int high) {
		if(low<=high) {
			int p = partition(arr, low, high);
			System.out.println(p);
			sort(arr,low,p-1);
			sort(arr,p+1,high);
			
			
		}
	}
}
