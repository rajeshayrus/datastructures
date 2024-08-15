package com.demo.sort.selectionsort;

public class SelectionSort {

	public static int[] sort(int[] arr) {
		
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
public static int[] ssort(int[] arr) {
		
		for(int i = 0; i<arr.length-1; i++) {
			int min = i;
			for(int j = i; j<arr.length-1;j++) {
				
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
