package com.demo.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*LongestCommonPrefix
 * Sorting
 * 
 * Sort the list
 * Compare the first string and last string 
 * return the common sub string
 * else return short string in first and last strings of array
 *
 * 
 * 
 * */


public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "aaa","aa" , "aaaa" };
		System.out.println(longestCommonPrefix(s));

	}



	public static String longestCommonPrefix(String[] strs) {

		Arrays.sort(strs);
		int baseIndex = Math.min(strs[0].length(), strs[strs.length-1].length());
		for (int i = 0; i < Math.min(strs[0].length(), strs[strs.length-1].length()); i++) {
			if (strs[0].charAt(i) != strs[strs.length-1].charAt(i)) {
				return strs[0].substring(0, i);
			}
		}
		return strs[0].substring(0, baseIndex);

	}
	
	public static String longestCommonPrefix1(String[] strs) {

		List<String> al = new ArrayList<String>();
		String base = strs[strs.length - 1];
		int baseIndex = base.length();
		al = Arrays.asList(strs);
		for (String s : al) {
			System.out.println(s);
			if (s.isEmpty())
				return "";
			for (int i = 0; i < baseIndex; i++) {
				try {
					if (base.charAt(i) != s.charAt(i)) {
						baseIndex = i;
						break;
					}
				} catch (StringIndexOutOfBoundsException a) {
					baseIndex = i;
					break;
				}
				
			}
		}

		return base.substring(0, baseIndex);

	}
}
