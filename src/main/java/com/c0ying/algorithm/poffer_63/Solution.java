package com.c0ying.algorithm.poffer_63;

public class Solution {

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length ==0 || prices.length==1) return 0;
        int result = 0;
        int minp = prices[0];

        for (int i = 1; i<prices.length; i++){
            minp = Math.min(minp, prices[i]);
            result = Math.max(result, prices[i] - minp);
        }
        return result;
    }

    public static int maxProfit2(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length ;i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], -prices[i]);
        }
        return dp[prices.length-1][0];
    }

    public static void main(String[] args) {
        int result = maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assert result == 5;
        System.out.println(result);
        System.out.println(maxProfit2(new int[]{7,6,4,3,1}));
    }
}
