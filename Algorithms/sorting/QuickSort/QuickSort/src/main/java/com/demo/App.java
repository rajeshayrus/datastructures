package com.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] array = {12,1,65,3,5,85,98};
    	//int[] result = QuickSort.partition(array);
        QuickSort.sort(array, 0, array.length-1);
        int[] result = QuickSort.result;
    	for(int i = 0;i<=result.length-1;++i) {
    		System.out.print(result[i]+" ");
    	}
    }
}
