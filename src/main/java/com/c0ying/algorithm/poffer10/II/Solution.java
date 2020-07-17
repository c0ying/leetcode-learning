package com.c0ying.algorithm.poffer10.II;

public class Solution {

    public static int numWays(int n) {
        if(n == 0 || n == 1) return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i<=n; i++){
            dp[i] = (int) ((dp[i-1] + dp[i-2]) % (1e9+7));
        }
        return dp[n];
    }
}
