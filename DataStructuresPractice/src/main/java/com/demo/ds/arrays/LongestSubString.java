package com.demo.ds.arrays;

import java.util.HashSet;

/*Longest Substring Without Repeating Characters
 * Two Pointer pattern
 * 
 * two pointers will be first two elements of array
 * Add the elements to Set
 * If it returns true then move the second pointer
 * else - 
 *  if  firstP == secondP move the both pointers
 *  else move first pointer
 *  consider the result as max of set size and previous result
 *  remove the ch[firstP-1] from the set
 * 
 * Add the second pointer element to set as it did not consider in loop
 * consider the result as max of set size and previous result
 * return result
 * 
*/
public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));

	}

	public static int lengthOfLongestSubstring(String s) {
		
		if(s.length()<2)
			return s.length();
		char[] ch = s.toCharArray();
		int firstP = 0;
		
		int secondP = 1;
		int result = 1;
		HashSet<Character> hs = new HashSet<Character>();
		hs.add(ch[0]);
		while(secondP < ch.length-1) {
			if (hs.add(ch[secondP])) {
				secondP++;
			} else {
				if (firstP == secondP) {
					firstP++;
					secondP++;
					
				}
					
				else {
					firstP++;
				}
				result = Math.max(result, hs.size());
				hs.remove(ch[firstP-1]);
			}
			
		}
		hs.add(ch[secondP]);
			
		result = Math.max(result, hs.size());
		return result;

	}

}
