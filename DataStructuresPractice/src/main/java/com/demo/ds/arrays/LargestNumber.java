package com.demo.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

/*Largest Number
 * 
 * Sorting
 * 
 * Convert numbers into string array
 * Sort the string array
 * append the strings to string builder
 * 
 * 
 * */


public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 2, 12, 14,9,90 };
		List<Integer> al = Arrays.asList(10, 2, 12, 14,9,90);
		al.stream().map((Function<? super Integer, ? extends Integer>) e -> {System.out.println("lazy loading test"+e);
		return e;}).findFirst();
		System.out.println(largestNumber(nums));

	}

	public static String largestNumber(int[] nums) {

		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			hm.put(i, new ArrayList<Integer>());
		}

		for (int i = 0; i < nums.length; i++) {
			ArrayList<Integer> al = new ArrayList<Integer>(hm.get(nums[i] % 10));
			al.add(nums[i]);
			Collections.sort(al);
			hm.put(nums[i] % 10, al);
			
			// hm.put(i%10,);
		}

		for (int i = 9; i >= 0; i--) {
			if (hm.get(i) != null) {
				hm.get(i).stream().forEach(e -> {
					result.append(e);
				});
			}

		}
		return result.toString();

	}
	public String largestNumberLeetcode(int[] nums) {
        String s[] = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s,(a,b) -> (b+a).compareTo(a+b));
        StringBuilder result = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            result.append(s[i]);
        }
        return result.charAt(0)=='0'?"0" : result.toString();
    }
	
	

}
