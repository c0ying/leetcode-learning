package com.c0ying.algorithm.s_122;

public class Solution {

    public static int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        if (prices.length == 2) return Math.max(0,prices[1]- prices[0]);
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(prices[i]+dp[i-1][1],dp[i-1][0]);
            dp[i][1] = Math.max(dp[i-1][0]-prices[i], dp[i-1][1]);
        }

        return dp[prices.length-1][0];
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
    }
}
