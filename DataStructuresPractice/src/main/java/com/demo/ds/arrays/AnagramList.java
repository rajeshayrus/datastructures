package com.demo.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


/*Anagram List 
 * 
 * Sorting and Hashing  patterns 
 * complexity O(n)
 * 
 * Sort every word in a for loop
 * add the sorted word and actual word to Map(String, List<String>)
 * sorted word as key and actual word to the list present in value
 * 
 * */
public class AnagramList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"","","","art"};
		System.out.println(groupAnagrams(s));

		
	}
	
public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        for (int i = 0; i<strs.length; i++) {
        	
        	char[] s = strs[i].toCharArray();
        	int sum = strs[i].length();
        	for(int x=0; x<s.length; x++) {
        		sum = sum + s[x];
        	}
        	if (hm.get(sum) == null) {
        		hm.put(sum, strs[i]);
        	} else {
        		hm.put(sum, hm.get(sum) + "," + strs[i]);
        	}
        	
        }
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> l = new ArrayList<String>();
        if(hm.get(0)!=null) {
        	String[] s = new String[hm.get(0).length()+1];
            for(int i = 0; i<hm.get(0).length()+1; i++) {
            	s[i] = "";
            }
            l = Arrays.asList(s);
            result.add(l);
        }
        
        
        
        hm.remove(0);
        
        for (Entry<Integer, String> e : hm.entrySet()) {
        	result.add(Arrays.asList(e.getValue().split(",")));
        }
        
		return result;
    }

}
