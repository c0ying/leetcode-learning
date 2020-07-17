package com.c0ying.algorithm.poffer_10.I;

public class Solution {

    public static int fib(int n) {
        if(n == 0) return 0;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i<=n; i++){
            dp[i] = (int) ((dp[i-1] + dp[i-2]) % (1e9+7));
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int r1 = fib(2);
        System.out.println(r1);
        int r2 = fib(5);
        System.out.println(r2);
    }
}
