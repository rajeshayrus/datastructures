package com.demo.sort.selectionsort;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World@#!" );
        int[] array = {12,1,65,5,85,98};
    	int[] result = SelectionSort.sort(array);
    	for(int i = 0;i<=result.length-1;++i) {
    		System.out.print(result[i]+" ");
    	}
    }
}
