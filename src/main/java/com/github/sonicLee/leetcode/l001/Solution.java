package com.github.sonicLee.leetcode.l001;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lens = nums.length;
        Map<Integer, Integer> nextnums = new HashMap<Integer, Integer>();
        for (int i = 0; i < lens; i++) {

                if (  nextnums.containsKey(nums[i]) ) {
                    return new int[]{(int) nextnums.get(nums[i]), i};
                }


            nextnums.put(target - nums[i],i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}