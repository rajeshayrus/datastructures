package com.demo.ds.arrays;

/*StockMaxProfit
 * 
 * Iterate the array
 * check two conditions :
 * 	current value is less than minimum value
 * 		assign current value to min and max
 *  current value is greater than maximum value
 *  	Assign current value to max
 *  	Calculate the profit
 * 
 * 
 * */


public class StockMaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {2,4,1};
		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {
		int min = prices[0];
		int max = 0;
		int result = 0;
		for(int i = 1 ; i< prices.length; i++) {
			if(prices[i] < min) {
				min = prices[i];
				max = prices[i];
			} else if (prices[i] > max) {
				max = prices[i];
				result = Math.max(result, max - min);
			}
		}
		return result ;

	}
}
