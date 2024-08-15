package com.demo.sort.insertionsort;

public class InsertionSort {

	public static int[] sort(int[] arr) {
		int n = arr.length;
		for(int i = 1; i<n;i++ ) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0&&arr[j]>temp) {
				arr[j+1]=arr[j];
				j=j-1;
			}
		}
		return arr;
		
	}
	
	public static int[] insertionSort(int[] a) {
		
		int i = 1;
		int j = i;
		
		while (i <= a.length) {
			if (j > 0) {
				if (a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					j--;
				} else {
					j = i;
					i++;
				}
			} else {
				j = i;
				i++;
			}
			
		}
		
		return a;
		
	}
}
