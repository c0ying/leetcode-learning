package com.c0ying.algorithm.poffer_03;

public class Solution {

    public int findRepeatNumber(int[] nums) {
        for (int i =0; i < nums.length; i++){
            while (nums[i] != i){
                if(nums[nums[i]] == nums[i]) return nums[i];
                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }
        return -1;
    }
}
