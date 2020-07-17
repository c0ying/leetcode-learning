package com.c0ying.algorithm.poffer_47;

public class Solution {

    public static int maxValue(int[][] grid) {
        int n =grid.length, m= grid[0].length;
        int[][] dp = new int[n][n];

        dp[0][0] = grid[0][0];
        for (int i = 1;i < grid.length; i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int i = 1;i < grid[0].length; i++){
            dp[0][i] = dp[0][i-1] + grid[0][i];

        }

        for (int i =1; i<grid.length; i++){
            for (int j =1; j < grid[i].length; j++){
                dp[i][j] = Math.max(dp[i][j-1]+grid[i][j], dp[i-1][j]+grid[i][j]);
            }
        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args) {
        int result = maxValue(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}});
        assert result == 12;
        System.out.println(result);
    }
}
