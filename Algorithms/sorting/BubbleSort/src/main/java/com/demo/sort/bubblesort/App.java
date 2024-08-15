package com.demo.sort.bubblesort;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	int[] array = {12,1,65,5,85,98};
    	int[] result = BubbleSort.bubbleSort(array);
    	for(int i = 0;i<=result.length-1;++i) {
    		System.out.println(result[i]);
    	}
    	System.out.println(result.length);
    }
}
