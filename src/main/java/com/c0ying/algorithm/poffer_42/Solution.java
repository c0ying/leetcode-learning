package com.c0ying.algorithm.poffer_42;

public class Solution {

    public static int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        int result = dp[0];
        for (int i = 1; i< nums.length; i++){
            dp[i] = dp[i-1]+nums[i] >= nums[i]? dp[i-1]+nums[i]:nums[i];
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        //assert result == 6;
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
