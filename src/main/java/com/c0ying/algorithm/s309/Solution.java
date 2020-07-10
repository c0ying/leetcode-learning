package com.c0ying.algorithm.s309;

/**
 * dp主要是在于状态的转换
 */
public class Solution {

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length <=0) return 0;
        int[][] dp = new int[prices.length][3];
        dp[0]=new int[]{0,-prices[0],0};
        for (int i =1; i<prices.length; i++){
            dp[i]=new int[]{0,0,0};
            //没有持有股票
            //1.没买，2.冻结期
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2]);
            //持有股票
            //1.不操作，2.今天买入
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
            //冷冻期
            //昨天卖出
            dp[i][2] = dp[i-1][1] + prices[i];
        }
        return Math.max(dp[prices.length-1][0],dp[prices.length-1][2]);
    }

    public static void main(String[] args) {
        int result = maxProfit(new int[]{1, 2, 3, 0, 2});
        System.out.println(result);
    }
}
