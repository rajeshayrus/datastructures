package com.demo.ds.arrays;


/*PalindromeSubString
 * 
 * Two Pointers
 * 
 * Consider two pointers first and last
 * Consider two variables and assign to first and last
 * check the palindrome condition b/w two variables (i, j)
 * 
 * if true 
 * 	-update the result set if it is long
 * 	-move the first pointer
 * 	-update the variables
 * else
 * 	-move the j variable towards i
 * 
 * if i and j overlaps
 * 	-move the first pointer and update the variables
 * 
 * 
 * */


public class PalindromeSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("aacabdkacaa"));

	}

	public static String longestPalindrome(String s) {
		
		char[] ch = s.toCharArray();
		int first = 0;
		int second = ch.length-1;
		int i = 0;
		int j = second;
		int[] result = {0,0};
		while(first < second) {
			if(i<j) {
				//System.out.println(i + "  " + j);
				if (compare(i , j, ch)) {
					if( result[1] - result[0] < (j - i + 1)) {
						result[0] = i;
						result[1] = j;
						first++;
						j = second;
						i = first;
						
					} else {
						first++;
						j = second;
						i = first;
					}
				}
				else {
					j--;
				}
			} else {
				first++;
				j = second;
				i = first;
				
			}
		}
		
		return s.substring(result[0], result[1] + 1);

	}
	
	public static boolean compare(int i, int j, char[] ch) {
		int y = j;
		int x = i;
		while (x < y) {
			if (ch[x] != ch[y]) 
				return false;
			else {
				y--;
				x++;
			}
		}
		return true;
	}

}
