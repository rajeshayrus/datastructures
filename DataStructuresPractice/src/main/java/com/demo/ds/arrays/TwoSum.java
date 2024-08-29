package com.demo.ds.arrays;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,3};
		
		int[] result = {0,0};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length ; i++) {
			hm.put(i, nums[i]);
		}
        int target= 6;
        for(Entry<Integer, Integer> current: hm.entrySet()) {
        	final int diff = target - current.getValue();
        	if(hm.containsValue(diff)) {
        		if(nums[current.getKey()]  != diff) {
        			result[0] = current.getKey();
            		result[1] = hm.entrySet().stream().filter(e -> e.getValue()==diff).collect(Collectors.toList()).get(0).getKey();
            		break;
        		} else if(nums[current.getKey()]  == diff || hm.entrySet().stream().filter(e -> e.getValue()==diff).count() ==2) {
        			result[0] = hm.entrySet().stream().filter(e -> e.getValue()==diff).collect(Collectors.toList()).get(0).getKey();
        			result[1] = hm.entrySet().stream().filter(e -> e.getValue()==diff).collect(Collectors.toList()).get(1).getKey();
        		}
        		
        	}
        }
        System.out.println(result[0] + "  "+ result[1]);

	}

}
