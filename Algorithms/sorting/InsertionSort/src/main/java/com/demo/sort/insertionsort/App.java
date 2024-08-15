package com.demo.sort.insertionsort;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] arr = {5,9,2,10,4,7};
        arr = InsertionSort.insertionSort(arr);
        for (int i = 0; i < arr.length ; i++) {
        	System.out.println(arr[i]);
        }
        
    }
}
