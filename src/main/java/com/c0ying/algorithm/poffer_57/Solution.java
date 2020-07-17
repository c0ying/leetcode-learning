package com.c0ying.algorithm.poffer_57;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    //Hash法只是其中一种方法，还有双指针，和暴力大法
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) return new int[0];
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int leftTarget = target-nums[i];
            if (map.containsKey(leftTarget)){
                result[0] = nums[i];
                result[1] = leftTarget;
                break;
            }else{
                map.put(nums[i], leftTarget);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{10,26,30,31,47,60}, 40)));
    }
}
