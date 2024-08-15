package com.demo.search.binarysearch;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	int[] array = {12,13,45,65,85,98};
    	int binarySearch = BinarySearch.binarySearch(array, 85);
    	System.out.println(binarySearch);
    }
}
