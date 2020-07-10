package com.c0ying.algorithm.s_63;

/**
 * 很妙的dp
 */
public class Solution {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1) return 0;
        if(n==1 && m ==1 && obstacleGrid[0][0] == 0) return 1;
        int[][] dp = new int[n][m];
        dp[0][0]=1;
        for(int i =1; i < m; i++){
            if(dp[0][i-1] == 0 || obstacleGrid[0][i] == 1){
                dp[0][i]=0;
            }else{
                dp[0][i]=1;
            }
        }
        for(int i =1; i<n; i++){
            if(dp[i-1][0] == 0 || obstacleGrid[i][0] == 1){
                dp[i][0]=0;
            }else{
                dp[i][0]=1;
            }
        }

        for(int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args) {
//        int[][] data = {{0,0,0},{0,1,0},{0,0,0}};
//        int result = uniquePathsWithObstacles(data);
//        assert result == 2;
//        System.out.println(result);
        int[][] data = {{0},{0}};
        int result = uniquePathsWithObstacles(data);
        assert result == 2;
        System.out.println(result);
    }
}
